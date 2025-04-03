package com.example.Veterinaria.service;

import com.example.Veterinaria.repository.MascotaRepository;
import com.example.Veterinaria.model.Mascota;
import com.example.Veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class MascotaService {
        @Autowired
        private MascotaRepository mascotaRepository;

        public List<Mascota> findAll() {
            return mascotaRepository.findAll();
        }

        public Mascota saveMascota(Mascota mascota) {
            return mascotaRepository.save(mascota);
        }

        public Optional<Mascota> findById(Integer id) {
            return mascotaRepository.findById(id);
        }

        public void eliminarMascota(Integer id) {
            mascotaRepository.deleteById(id);
        }
    }