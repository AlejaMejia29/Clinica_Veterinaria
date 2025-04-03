package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
    Optional<Veterinario> findByCorreo(String correo);
}

