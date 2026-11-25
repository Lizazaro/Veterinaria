



package Main;

import Controlador.Controlador;
import Modelo.GestionClinica;





public class ProyetoHuellitas4Life {

    
    private static final double TARIFA_BASE = 50000;
    private static final double VALOR_SEDACION = 80000;

    public static void main(String[] args) {
        
        GestionClinica gestion = new GestionClinica(TARIFA_BASE, VALOR_SEDACION);
        Controlador controlador = new Controlador(gestion);
        java.awt.EventQueue.invokeLater(controlador::iniciar);
    }
}
