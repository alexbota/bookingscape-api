package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String email);
    List<User> getUsers();
}
