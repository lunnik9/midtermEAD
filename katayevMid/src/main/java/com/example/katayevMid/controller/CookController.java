package com.example.katayevMid.controller;

import com.example.katayevMid.entity.Cook;
import com.example.katayevMid.repository.CookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cook")
public class CookController {
    private CookRepository cookRepository;

    @GetMapping("/{id}")
    public Cook getCookById(@PathVariable("id") Long id) {
        return cookRepository.getOne(id);
    }

    @PostMapping("")
    public Cook addUser(@RequestBody Cook user) {
        return cookRepository.save(user);
    }
}
