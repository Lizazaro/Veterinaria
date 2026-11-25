



package Modelo;

import java.util.ArrayList;
import java.util.List;





public class historialClinico {
    private List<Consulta> consultas = new ArrayList<>();

    public void agregarConsulta(Consulta c) {
        consultas.add(c);
    }

    public List<Consulta> listarConsulta() {
        return consultas;
    }
    
    
}