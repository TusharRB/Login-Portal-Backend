package com.example.Login_portal.Repository;

import com.example.Login_portal.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {


//    Retrieves a user by their username.
//
//     @param username The username of the user.
//     @return The user object if found, null otherwise.
    User findByUsername(String username);
}
