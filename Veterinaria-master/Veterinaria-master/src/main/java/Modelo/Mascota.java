



package Modelo;





public class Mascota {
    private String id;
    private String nombre;
    private int edad;
    private double peso;
    private Propietario propietario;
    private historialClinico historial;

    public Mascota(String id, String nombre, int edad, double peso, Propietario propietario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
        this.historial = new historialClinico();
    }

    public double calcularRecargo(double tarifaBase) {
        return 0;
    }

    public double calcularCostoAdici(double costoSedacion) {
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public historialClinico getHistorial() {
        return historial;
    }
}