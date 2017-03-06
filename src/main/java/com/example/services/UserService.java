package com.example.services;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public Optional<User> findOne(Long id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    int updateNameById(String newName, int age, Long id) {
        return userRepository.setNewName(newName, age, id);
    }

    public List<User> findAll(String name){
        return userRepository.findByNameIgnoreCase(name);
    }
}
