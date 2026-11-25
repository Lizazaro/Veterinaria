



package Modelo;







public class Vacuna {
    private String nombre;
    private double costo;
    private int dosis;
    private String tipo;

    public Vacuna(String nombre, double costo, int dosis) {
        this(nombre, costo, dosis, "Vacuna");
    }

    public Vacuna(String nombre, double costo, int dosis, String tipo) {
        this.nombre = nombre;
        this.costo = costo;
        this.dosis = dosis;
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDosis() {
        return dosis;
    }

    public String getTipo() {
        return tipo;
    }
}
