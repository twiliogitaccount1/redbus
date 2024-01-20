package com.flightreservation.controller;

import com.flightreservation.entity.User;
import com.flightreservation.payload.LoginDto;
import com.flightreservation.repository.UserRepository;
import com.flightreservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepo;


    // save user
    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // to login

    @PostMapping("/verifyLogin")
    public ResponseEntity<String> saveUser(@RequestBody LoginDto loginDto) {
        User user = userRepo.findByEmail(loginDto.getEmail());
        if (user != null) {
            if (user.getEmail().equals(loginDto.getEmail()) && user.getPassword().equals(loginDto.getPassword())) {
                return new ResponseEntity<>("login is successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Emalil/password is not correct", HttpStatus.BAD_REQUEST);
            }

        } else {
            return new ResponseEntity<>("Email is empty / In- correct ", HttpStatus.BAD_REQUEST);
        }

    }
}