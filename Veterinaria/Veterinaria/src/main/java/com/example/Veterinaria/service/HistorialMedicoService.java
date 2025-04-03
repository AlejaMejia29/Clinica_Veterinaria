package com.example.Veterinaria.service;

import com.example.Veterinaria.repository.HistorialMedicoRepository;
import com.example.Veterinaria.model.HistorialMedico;
import com.example.Veterinaria.repository.HistorialMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class HistorialMedicoService {
        @Autowired
        private HistorialMedicoRepository historialMedicoRepository;

        public List<HistorialMedico> findAll() {
            return historialMedicoRepository.findAll();
        }

        public HistorialMedico saveHistorial(HistorialMedico historialMedico) {
            return historialMedicoRepository.save(historialMedico);
        }

        public Optional<HistorialMedico> findById(Integer id) {
            return historialMedicoRepository.findById(id);
        }

        public void eliminarHistorial(Integer id) {
            historialMedicoRepository.deleteById(id);
        }
    }
