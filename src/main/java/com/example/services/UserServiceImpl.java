package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
