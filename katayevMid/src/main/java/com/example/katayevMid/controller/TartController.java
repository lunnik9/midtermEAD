package com.example.katayevMid.controller;

import com.example.katayevMid.entity.Cake;
import com.example.katayevMid.entity.Tart;
import com.example.katayevMid.repository.CakeRepository;
import com.example.katayevMid.repository.TartRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/tart")
public class TartController {
    private TartRepository tartRepository;

    @GetMapping("/{name}")
    public Tart BakeCake(@PathVariable("name") String name) throws SQLException, InterruptedException {
        Tart tart = tartRepository.getOne(name);
        tart.bake(name);
        return tart;
    }
}
