package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.Role;
import com.alexbota.bookingscape.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String email, String roleName);
    User getUser(String email);
    List<User> getUsers();
}
