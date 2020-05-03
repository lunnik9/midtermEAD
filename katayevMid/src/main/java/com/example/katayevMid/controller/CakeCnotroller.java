package com.example.katayevMid.controller;

import com.example.katayevMid.entity.Cake;
import com.example.katayevMid.repository.CakeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/cake")
public class CakeCnotroller {
    private CakeRepository cakeRepository;

    @GetMapping("/{name}")
    public Cake BakeCake(@PathVariable("name") String name) throws SQLException, InterruptedException {
        Cake cake = cakeRepository.getOne(name);
        cake.bake(name);
        return cake;
    }
}
