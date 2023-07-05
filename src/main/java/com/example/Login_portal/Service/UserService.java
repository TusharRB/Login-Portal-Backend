package com.example.Login_portal.Service;

import com.example.Login_portal.Model.User;
import com.example.Login_portal.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


//
//      Handles the user signup functionality.
//
//      @param user , The user object to be signed up.
//      @return The saved user object.
//

    public User signup(User user) {

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);

    }

//    Handles the user login functionality.
//
//       @param username , The username of the user trying to login.
//       @param password , The password of the user trying to login.
//       @return The user object if login is successful, null otherwise

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

}

