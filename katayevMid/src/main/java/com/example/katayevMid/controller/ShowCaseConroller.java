package com.example.katayevMid.controller;

import com.example.katayevMid.entity.Cook;
import com.example.katayevMid.entity.Product;
import com.example.katayevMid.entity.Showcase;
import com.example.katayevMid.exceptions.CakeTartException;
import com.example.katayevMid.repository.ShowCaseRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/showcase")
public class ShowCaseConroller {
    ShowCaseRepository showCaseRepository;

    @GetMapping("/{name}")
    public Showcase GetShowCaseByName(@PathVariable("name") String name) {
        return showCaseRepository.getOne(name);
    }

    @PostMapping("")
    public Showcase addShowCase(@RequestBody Showcase showcase) {
        return showCaseRepository.save(showcase);
    }

    @PostMapping("/add/product")
    public void addProduct(@RequestBody Product product, @RequestBody String name) throws CakeTartException {
        Showcase showcase = showCaseRepository.getOne(name);
        showcase.add(product);
        showCaseRepository.save(showcase);
    }


}
