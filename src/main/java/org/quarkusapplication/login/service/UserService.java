package org.quarkusapplication.login.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.quarkusapplication.login.domain.User;
import org.quarkusapplication.login.exception.UserNotFoundException;
import org.quarkusapplication.login.repository.UserRepository;

@ApplicationScoped
@Slf4j
public class UserService {
    @Inject
    UserRepository userRepository;

    public void checkUser(String username, String password){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User not found!"));
        if (!user.getPassword().equals(password)) {
            throw new UserNotFoundException("Invalid credentials!");
        }
    }
}
