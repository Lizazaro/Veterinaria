



package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Veterinario extends Empleado {
    private String especialidad;
    private String tarjetaProfesional;

    public Veterinario(String nombre, String cedula, String correo, String telefono,
                       String usuario, String contraseña, String especialidad, String tarjetaProfesional) {
        super(nombre, cedula, correo, telefono, usuario, contraseña);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Consulta registrarConsulta(LocalDate fecha, Mascota m, String diagnostico, String notas, List<Vacuna> vacunas) {
        return registrarConsulta(fecha, m, diagnostico, notas, vacunas, null);
    }

    public Consulta registrarConsulta(LocalDate fecha, Mascota m, String diagnostico, String notas, List<Vacuna> vacunas, Cita cita) {
        return new Consulta(fecha, diagnostico, notas, m, this, vacunas, cita);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}