package com.example.katayevMid.repository;

import com.example.katayevMid.entity.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends JpaRepository<Cook, Long> {
    Cook findByUsername(String username);

}
