package com.alexbota.bookingscape.repository;

import com.alexbota.bookingscape.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findUserById(Long id);
}
