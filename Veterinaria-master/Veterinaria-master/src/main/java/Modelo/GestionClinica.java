



package Modelo;

import java.util.ArrayList;
import java.util.List;




public class GestionClinica {
    private List<Propietario> propietarios;
    private List<Mascota> mascotas;
    private List<Empleado> empleados;
    private List<Cita> citas;
    private List<Consulta> consultas;
    private List<Cobro> cobros;

    private double tarifaBase;
    private double valorSedacionFija;

    public GestionClinica(double tarifaBase, double valorSedacionFija) {
        this.tarifaBase = tarifaBase;
        this.valorSedacionFija = valorSedacionFija;
        this.propietarios = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.cobros = new ArrayList<>();
    }

    public void registrarPropietario(Propietario p) {
        if (p != null && buscarPropietarioPorCedula(p.getCedula()) == null) {
            propietarios.add(p);
        }
    }

    public Propietario buscarPropietarioPorCedula(String cedula) {
        for (Propietario p : propietarios) {
            if (p.getCedula().equalsIgnoreCase(cedula)) {
                return p;
            }
        }
        return null;
    }

public boolean registrarMascota(Mascota m) {
        if (m != null && buscarMascotaPorId(m.getId()) == null) {
            mascotas.add(m);
            if (m.getPropietario() != null) {
                m.getPropietario().agregarMascota(m);
            }
            return true;
        }
        return false;
    }

    public Mascota buscarMascotaPorId(String id) {
        for (Mascota m : mascotas) {
            if (m.getId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    public void registrarEmpleado(Empleado e) {
        if (e != null) {
            empleados.add(e);
        }
    }

    public Empleado autenticarEmpleado(String usuario, String clave) {
        for (Empleado e : empleados) {
            if (e.getUsuario().equals(usuario) && e.validarClave(clave)) {
                return e;
            }
        }
        return null;
    }

    public void agendarCita(Cita c) {
        if (c != null) {
            citas.add(c);
        }
    }

    public List<Cita> obtenerAgendaVeterinario(Veterinario vet) {
        List<Cita> agenda = new ArrayList<>();
        for (Cita c : citas) {
            if (c.getVeterinario() != null && c.getVeterinario().equals(vet)) {
                agenda.add(c);
            }
        }
        return agenda;
    }

    public void registrarConsulta(Consulta c) {
        if (c != null) {
            consultas.add(c);
        }
    }

    public Cobro generarCobro(Consulta c) {
        return generarCobro(c, true);
    }

    public Cobro generarCobro(Consulta c, boolean aplicarDescuento) {
        if (c == null) {
            return null;
        }
        Cobro cobro = new Cobro(c, this.tarifaBase, this.valorSedacionFija, aplicarDescuento);
        cobros.add(cobro);
        return cobro;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getValorSedacionFija() {
        return valorSedacionFija;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Cobro> getCobros() {
        return cobros;
    }
}