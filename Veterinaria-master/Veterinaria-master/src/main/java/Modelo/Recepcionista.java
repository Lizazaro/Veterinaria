



package Modelo;





public class Recepcionista extends Empleado {

    public Recepcionista(String nombre, String cedula, String correo, String telefono, String usuario, String contraseña) {
        super(nombre, cedula, correo, telefono, usuario, contraseña);
    }

    public void registrarPropietario(GestionClinica gestion, Propietario p) {
        gestion.registrarPropietario(p);
    }

    public void registrarMascota(GestionClinica gestion, Mascota m) {
        gestion.registrarMascota(m);
    }

    public void agendarCita(GestionClinica gestion, Cita c) {
        gestion.agendarCita(c);
    }

    public Cobro cobrarConsulta(GestionClinica gestion, Consulta c) {
        return gestion.generarCobro(c);
    }
}