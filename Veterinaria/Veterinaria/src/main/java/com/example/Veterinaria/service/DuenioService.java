package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.repository.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DuenioService {
    @Autowired
    private DuenioRepository duenioRepository;

    public List<Duenio> findAll() {
        return duenioRepository.findAll();
    }

    public Duenio saveDuenio(Duenio duenio) {
        return duenioRepository.save(duenio);
    }

    public Optional<Duenio> findById(Integer id) {
        return duenioRepository.findById(id);
    }

    public void eliminarDuenio(Integer id) {
        duenioRepository.deleteById(id);
    }
}

