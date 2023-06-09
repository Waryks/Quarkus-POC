package org.quarkusapplication.login.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.quarkusapplication.login.domain.User;

import java.util.Optional;

public interface UserRepository extends PanacheRepository<User> {
    Optional<User> findByUsername(String username);
}