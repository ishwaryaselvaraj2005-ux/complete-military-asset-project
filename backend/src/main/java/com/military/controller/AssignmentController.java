package com.military.controller;

import com.military.model.Assignment;
import com.military.repo.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {
    @Autowired private AssignmentRepository repo;
    @GetMapping public List<Assignment> all(){ return repo.findAll(); }
    @PostMapping public Assignment create(@RequestBody Assignment a){
        a.setAssignedDate(LocalDateTime.now());
        return repo.save(a);
    }
}
