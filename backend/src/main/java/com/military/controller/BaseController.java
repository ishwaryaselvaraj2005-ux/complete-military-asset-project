package com.military.controller;

import com.military.model.Base;
import com.military.repo.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bases")
public class BaseController {
    @Autowired private BaseRepository repo;
    @GetMapping public List<Base> list(){ return repo.findAll(); }
    @PostMapping public Base create(@RequestBody Base b){ return repo.save(b); }
}
