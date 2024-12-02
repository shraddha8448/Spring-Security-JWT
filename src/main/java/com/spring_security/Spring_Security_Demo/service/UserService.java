package com.spring_security.Spring_Security_Demo.service;

import com.spring_security.Spring_Security_Demo.dao.UserRepo;
import com.spring_security.Spring_Security_Demo.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }
}
