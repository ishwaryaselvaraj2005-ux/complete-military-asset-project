package com.military.controller;

import com.military.model.Transfer;
import com.military.repo.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {
    @Autowired private TransferRepository repo;
    @GetMapping public List<Transfer> all(){ return repo.findAll(); }
    @PostMapping public Transfer create(@RequestBody Transfer t){
        t.setTimestamp(LocalDateTime.now());
        return repo.save(t);
    }
}
