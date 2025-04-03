package com.example.Veterinaria.dto;

import jakarta.validation.constraints.NotBlank;

public class HistorialMedicoDto {
    @NotBlank(message = "Diagnóstico es obligatorio")
    private String diagnóstico;
    @NotBlank(message = "Tratamiento es obligatorio")
    private String tratamiento;
    private String medicación;
    private String notas;

    public String getDiagnóstico() {
        return diagnóstico;
    }

    public void setDiagnóstico(String diagnóstico) {
        this.diagnóstico = diagnóstico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicación() {
        return medicación;
    }

    public void setMedicación(String medicación) {
        this.medicación = medicación;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
