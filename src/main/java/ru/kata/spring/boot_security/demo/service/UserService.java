package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User getById(Long id);
    List<User> getListUsers();
    User findByUsername(String username);
}
