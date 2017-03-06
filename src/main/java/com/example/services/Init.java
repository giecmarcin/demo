package com.example.services;

import com.example.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class Init {
    @Autowired
    private UserService userService;

    @PostConstruct
    void init() {
        //int result = userService.updateNameById("John", 19, 1L);
        //System.out.println("Result " + result);
//        Optional<User> user = userService.findOne(1L);
//        if(user.isPresent()){
//            user.get().setName("Trala");
//            userService.save(user.get());
//        }
        List<User> all = userService.findAll("trala");
        System.out.println("Size " + all.size());
    }
}
