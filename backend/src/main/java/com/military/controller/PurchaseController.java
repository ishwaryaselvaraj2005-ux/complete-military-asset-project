package com.military.controller;

import com.military.model.Purchase;
import com.military.repo.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
    @Autowired private PurchaseRepository repo;

    @GetMapping public List<Purchase> all(){ return repo.findAll(); }

    @PostMapping public Purchase create(@RequestBody Purchase p){
        p.setPurchaseDate(LocalDateTime.now());
        return repo.save(p);
    }
}
