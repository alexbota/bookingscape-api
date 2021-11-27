package com.alexbota.bookingscape.repository;

import com.alexbota.bookingscape.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
