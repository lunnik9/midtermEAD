package com.example.katayevMid.service.impl;

import com.example.katayevMid.entity.Cook;
import com.example.katayevMid.repository.CookRepository;
import com.example.katayevMid.service.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookServiceImpl implements CookService, UserDetailsService {
    @Autowired
    private CookRepository cookRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<Cook> getAllCooks() {
        return cookRepository.findAll();
    }

    @Override
    public void createCook(Cook cook) {

    }

    @Override
    public void updateCook(Long id, Cook cook) {

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Cook cook = cookRepository.findByUsername(s);
        if (cook == null) {
            throw new UsernameNotFoundException("Cook: " + s + " not found!");
        }
        return cook;
    }
}
