package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Veterinario;
import com.example.Veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class VeterinarioService {
        @Autowired
        private VeterinarioRepository veterinarioRepository;

        public List<Veterinario> findAll() {
            return veterinarioRepository.findAll();
        }

        public Veterinario saveVeterinario(Veterinario veterinario) {
            return veterinarioRepository.save(veterinario);
        }

        public Optional<Veterinario> findById(Integer id) {
            return veterinarioRepository.findById(id);
        }

        public void eliminarVeterinario(Integer id) {
            veterinarioRepository.deleteById(id);
        }
    }
