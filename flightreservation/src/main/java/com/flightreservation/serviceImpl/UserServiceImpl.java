package com.flightreservation.serviceImpl;

import com.flightreservation.entity.User;
import com.flightreservation.repository.UserRepository;
import com.flightreservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService
{
    @Autowired
    private UserRepository userRepo ;
   // to save user
    @Override
    public User saveUser(User user)
    {
        User savedUser = userRepo.save(user);
        return savedUser;
    }
}

