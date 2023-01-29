package controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import models.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public UserController() {
    }


    @GetMapping
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')") // admin rolün varsa bu listelemeyi yapabilirsin yetkisi.
    //PreAuthorize rollere admin vs yetkisi vererek daha da spesifik yetkilendirmeler yapılıyor.
    public List<User> list(){
        return userService.list();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PatchMapping
    public void addRoles(@RequestBody AddRoleRequest request){
        userService.addRoleTo(request.username, request.getRole());
    }

    @Data
    class AddRoleRequest{
        private String username;
        private String role;
    }
}
