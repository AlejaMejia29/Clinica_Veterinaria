package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DuenioRepository extends JpaRepository<Duenio, Integer> {
    Optional<Duenio> findByCorreoOrTeléfono(String correo, String teléfono);
}

