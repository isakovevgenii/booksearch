package com.boots.controller;

import com.boots.entity.User;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public List<User> userList() {
        return userService.allUsers();
    }

//    @DeleteMapping("/admin/{id}")
//    public ResponseEntity<Long> deleteUser(@PathVariable Long userId) {
//
//        User user = userService.findUserById(userId);
//        if (user == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(userId, HttpStatus.OK);
//    }
}
