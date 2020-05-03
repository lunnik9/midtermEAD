package com.example.katayevMid.repository;

import com.example.katayevMid.entity.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends JpaRepository<Cake, String> {
}
