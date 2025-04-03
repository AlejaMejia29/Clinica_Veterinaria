package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Integer> {
    List<Cita> findByEstado(String estado);
}

