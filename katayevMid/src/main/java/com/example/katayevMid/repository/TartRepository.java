package com.example.katayevMid.repository;

import com.example.katayevMid.entity.Tart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TartRepository extends JpaRepository<Tart, String> {
}
