package Modelo;

public class Cobro {
    private Consulta consulta;
    private double tarifaBase;
    private double costoVacunas;
    private double recargo;
    private double costoSedacion;
    private double descuento;
    private double total;

    public Cobro(Consulta consulta, double tarifaBase, double valorSedacionFija) {
        this(consulta, tarifaBase, valorSedacionFija, true);
    }

    public Cobro(Consulta consulta, double tarifaBase, double valorSedacionFija, boolean aplicarDescuento) {
        this.consulta = consulta;
        this.tarifaBase = tarifaBase;
        this.costoVacunas = consulta.calcularCostoVacunas();

        Mascota mascota = consulta.getMascota();
        this.recargo = mascota.calcularRecargo(tarifaBase);
        this.costoSedacion = mascota.calcularCostoAdici(valorSedacionFija);

        this.descuento = aplicarDescuento
                && mascota.getPropietario() != null
                && mascota.getPropietario().tieneMasDeDosMascotas() ? 10 : 0;

        this.total = calcularTotal();
    }

    public double calcularSubtotal() {
        return this.tarifaBase + this.costoVacunas + this.costoSedacion + this.recargo;
    }

    public double calcularDescuentoDinero() {
        return calcularSubtotal() * (this.descuento / 100.0);
    }

    public double calcularTotal() {
        this.total = calcularSubtotal() - calcularDescuentoDinero();
        return this.total;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getCostoVacunas() {
        return costoVacunas;
    }

    public double getRecargo() {
        return recargo;
    }

    public double getCostoSedacion() {
        return costoSedacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }
}