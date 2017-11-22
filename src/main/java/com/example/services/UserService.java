package com.example.services;

import com.example.models.User;

import java.util.List;

public interface UserService {
    public User save(User user);
    public List<User> findAll();
    public void deleteById(Long id);
}
