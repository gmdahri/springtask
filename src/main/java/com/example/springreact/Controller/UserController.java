package com.example.springreact.Controller;

import com.example.springreact.Entities.UserInfo;
import com.example.springreact.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;

    @CrossOrigin
    @GetMapping("/setData")
    public List<UserInfo> getData(){
        return (List<UserInfo>) userRepo.findAll();
    }


    @CrossOrigin
    @PostMapping("/getData")
    public List<UserInfo> postData(@RequestBody UserInfo user){
        userRepo.save(user);
        return (List<UserInfo>) userRepo.findAll();
    }
}
