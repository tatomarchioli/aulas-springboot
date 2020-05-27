package br.com.marchioli.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marchioli.service.UserService;

/**
 * UserController
 */

@RestController
public class UserController {

    private final UserService userService;
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    String createUser() {
        return userService.createUser();
    }
}