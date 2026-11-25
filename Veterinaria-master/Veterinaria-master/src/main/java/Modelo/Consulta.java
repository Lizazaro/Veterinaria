



package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate fecha;
    private String diagnostico;
    private String notaMedica;
    private Mascota mascota;
    private Veterinario veterinario;
    private List<Vacuna> vacunas;
    private Cita cita;

    public Consulta(LocalDate fecha, String diagnostico, String notaMedica, Mascota mascota, Veterinario veterinario, List<Vacuna> vacunas) {
        this(fecha, diagnostico, notaMedica, mascota, veterinario, vacunas, null);
    }

    public Consulta(LocalDate fecha, String diagnostico, String notaMedica, Mascota mascota, Veterinario veterinario, List<Vacuna> vacunas, Cita cita) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.notaMedica = notaMedica;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.vacunas = (vacunas != null) ? vacunas : new ArrayList<>();
        this.cita = cita;

        if (this.mascota != null && this.mascota.getHistorial() != null) {
            this.mascota.getHistorial().agregarConsulta(this);
        }

        if (this.cita != null) {
            this.cita.marcarAtendida();
        }
    }

    public double calcularCostoVacunas() {
        double totalVacunas = 0;
        for (Vacuna v : this.vacunas) {
            totalVacunas += v.getCosto() * v.getDosis();
        }
        return totalVacunas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getNotaMedica() {
        return notaMedica;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public List<Vacuna> getVacunas() {
        return vacunas;
    }

    public Cita getCita() {
        return cita;
    }
}