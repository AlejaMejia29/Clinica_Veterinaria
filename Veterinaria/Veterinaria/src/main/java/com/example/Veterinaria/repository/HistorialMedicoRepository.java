package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.HistorialMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistorialMedicoRepository extends JpaRepository<HistorialMedico, Integer> {
    List<HistorialMedico> findByDiagnósticoContaining(String keyword);
}

