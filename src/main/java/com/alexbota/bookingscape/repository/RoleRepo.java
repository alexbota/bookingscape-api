package com.alexbota.bookingscape.repository;

import com.alexbota.bookingscape.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}