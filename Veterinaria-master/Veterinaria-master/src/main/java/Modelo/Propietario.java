



package Modelo;

import java.util.ArrayList;
import java.util.List;





public class Propietario extends Persona {
    private String id;
    private String direccion;
    private List<Mascota> mascotas;

   public Propietario(String nombre, String cedula, String correo, String telefono, String id, String direccion) {
        super(nombre, cedula, correo, telefono);
        this.id = id;
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }
public void agregarMascota(Mascota mascota) {
        if (mascota != null && !this.mascotas.contains(mascota)) {
            this.mascotas.add(mascota);
        }
    }

    public int contarMascotas() {
        return this.mascotas.size();
    }

    public boolean tieneMasDeDosMascotas() {
        return this.mascotas.size() > 2;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
}