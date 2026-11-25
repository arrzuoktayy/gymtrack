package com.example.gymtrack.service;

import com.example.gymtrack.model.Antrenman;
import com.example.gymtrack.repository.AntrenmanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AntrenmanService {

    private final AntrenmanRepository repository;

    public AntrenmanService(AntrenmanRepository repository) {
        this.repository = repository;
    }

    public List<Antrenman> listele() {
        return repository.findAll();
    }

    public void kaydet(Antrenman antrenman) {
        repository.save(antrenman);
    }

    public void sil(Long id) {
        repository.deleteById(id);
    }
}