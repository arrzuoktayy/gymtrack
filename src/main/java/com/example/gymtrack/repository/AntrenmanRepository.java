package com.example.gymtrack.repository;

import com.example.gymtrack.model.Antrenman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntrenmanRepository
        extends JpaRepository<Antrenman, Long> {

}