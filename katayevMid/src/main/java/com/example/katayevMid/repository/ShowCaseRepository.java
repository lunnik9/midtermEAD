package com.example.katayevMid.repository;

import com.example.katayevMid.entity.Showcase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowCaseRepository extends JpaRepository<Showcase, String> {
}
