package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
    List<Mascota> findByEspecie(String especie);
}

