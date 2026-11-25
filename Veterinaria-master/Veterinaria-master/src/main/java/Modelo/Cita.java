



package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private String id;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private String estadoCita;
    private Mascota mascota;
    private Veterinario veterinario;

    public Cita(String id, LocalDate fecha, LocalTime hora, String motivo, String estadoCita, Mascota mascota, Veterinario veterinario) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public void marcarAtendida() {
        this.estadoCita = "Atendida";
    }

    public String getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
}