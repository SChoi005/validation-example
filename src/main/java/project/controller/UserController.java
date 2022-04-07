package project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.entity.User;

@RestController
@RequestMapping("/api")
public class UserController{
    
    @PostMapping("/user")
    public ResponseEntity<?> user(@Validated @RequestBody User user){
        return ResponseEntity.ok().body(user);
    }
}