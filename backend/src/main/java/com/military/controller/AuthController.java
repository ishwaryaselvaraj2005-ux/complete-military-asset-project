package com.military.controller;

import com.military.model.AppUser;
import com.military.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String,String> body){
        String username = body.get("username");
        String password = body.get("password");
        AppUser u = userRepo.findByUsername(username).orElse(null);
        if(u != null && u.getPassword().equals(password)){
            // demo token: ROLE:username
            String token = u.getRole() + ":" + u.getUsername();
            Map<String,String> res = new HashMap<>();
            res.put("token", token);
            res.put("role", u.getRole());
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
