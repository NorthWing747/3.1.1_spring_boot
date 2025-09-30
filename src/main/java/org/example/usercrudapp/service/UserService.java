package org.example.usercrudapp.service;

import org.example.usercrudapp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    User save(User user);
    User updateUser(User user);
    void delete(Long id);
}
