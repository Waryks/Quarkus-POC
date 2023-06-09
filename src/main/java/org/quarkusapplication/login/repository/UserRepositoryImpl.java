package org.quarkusapplication.login.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.quarkusapplication.login.domain.User;

import java.util.Optional;

@ApplicationScoped
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> findByUsername(String username) {
        return find("username", username).firstResultOptional();
    }
}
