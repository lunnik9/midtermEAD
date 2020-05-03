package com.example.katayevMid.service;

import com.example.katayevMid.entity.Cook;

import java.util.List;

public interface CookService {

    List<Cook> getAllCooks();

    void createCook(Cook cook);

    void updateCook(Long id, Cook cook);
}