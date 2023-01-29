package controllers;

import lombok.RequiredArgsConstructor;
import models.Role;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/roles")
public class RoleController {

    private final UserService userService;

    @PostMapping
    public Role save(@RequestBody Role role){
        return userService.save(role);
    }
}
