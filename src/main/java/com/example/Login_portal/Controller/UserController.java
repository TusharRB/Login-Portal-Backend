package com.example.Login_portal.Controller;

import com.example.Login_portal.Model.User;
import com.example.Login_portal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserService userService;



//      Handles the user signup functionality.
//      @param user,  The user object to be signed up.
//      @return ResponseEntity containing the created user and HTTP status code 201 (CREATED).


    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User user) {

        User createdUser = userService.signup(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }



//       Handles the user login functionality.
//       @param username , The username of the user trying to login.
//       @param password ,  The password of the user trying to login.
//       @return ResponseEntity containing the authenticated user and HTTP status code 200 (OK)
//       if login is successful,
//          or ResponseEntity with HTTP status code 401 (UNAUTHORIZED) if login fails.

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password) {
        User user = userService.login(username, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
