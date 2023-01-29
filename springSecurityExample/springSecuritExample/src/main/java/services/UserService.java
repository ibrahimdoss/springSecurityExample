package services;

import models.Role;
import models.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService{



    User save(User user);
    Role save(Role role);
    void addRoleTo(String username, String role);
    User get(String username);
    List<User> list();
}
