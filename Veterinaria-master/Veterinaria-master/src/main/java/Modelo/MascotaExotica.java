package Modelo;

public class MascotaExotica extends Mascota {
    private String tipoExotico;
    private String numeroPermiso;
    private boolean requiereSedacion;

    public MascotaExotica(String id, String nombre, int edad, double peso, Propietario propietario,
                          String tipoExotico, String numeroPermiso, boolean requiereSedacion) {
        super(id, nombre, edad, peso, propietario);
        this.tipoExotico = tipoExotico;
        this.numeroPermiso = numeroPermiso;
        this.requiereSedacion = requiereSedacion;
    }

    @Override
    public double calcularRecargo(double tarifaBase) {
        return tarifaBase * 0.25;
    }

    @Override
    public double calcularCostoAdici(double costoSedacion) {
        return this.requiereSedacion ? costoSedacion : 0;
    }

    public String getTipoExotico() {
        return tipoExotico;
    }

    public String getNumeroPermiso() {
        return numeroPermiso;
    }

    public boolean isRequiereSedacion() {
        return requiereSedacion;
    }
}