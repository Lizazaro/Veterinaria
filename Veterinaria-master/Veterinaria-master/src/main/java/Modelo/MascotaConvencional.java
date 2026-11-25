package Modelo;

import java.util.ArrayList;
import java.util.List;

public class MascotaConvencional extends Mascota {
    private String tipoConvencional;
    private String raza;
    private List<Vacuna> vacunasEsquema;

    public MascotaConvencional(String id, String nombre, int edad, double peso, Propietario propietario,
                               String tipoConvencional, String raza, List<Vacuna> vacunasEsquema) {
        super(id, nombre, edad, peso, propietario);
        this.tipoConvencional = tipoConvencional;
        this.raza = raza;
        this.vacunasEsquema = (vacunasEsquema != null) ? vacunasEsquema : new ArrayList<>();
    }

    @Override
    public double calcularRecargo(double tarifaBase) {
        return 0;
    }

    @Override
    public double calcularCostoAdici(double costoSedacion) {
        return 0;
    }

    public String getTipoConvencional() {
        return tipoConvencional;
    }

    public String getRaza() {
        return raza;
    }

    public List<Vacuna> getVacunasEsquema() {
        return vacunasEsquema;
    }
}