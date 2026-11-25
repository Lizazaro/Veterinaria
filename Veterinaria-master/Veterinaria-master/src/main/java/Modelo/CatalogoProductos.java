package Modelo;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class CatalogoProductos {
    public static final String TIPO_VACUNA = "Vacuna";
    public static final String[] TIPOS = {TIPO_VACUNA};

    private static final Map<String, Double> PRECIOS = new LinkedHashMap<>();

    static {
        PRECIOS.put("rabia", 35000.0);
        PRECIOS.put("parvovirus", 45000.0);
        PRECIOS.put("moquillo", 45000.0);
        PRECIOS.put("triple felina", 50000.0);
        PRECIOS.put("leucemia felina", 60000.0);
        PRECIOS.put("polivalente", 55000.0);
    }

    private CatalogoProductos() {
    }

    private static String clave(String nombre) {
        String n = nombre == null ? "" : nombre.trim().toLowerCase(Locale.ROOT);
        return java.text.Normalizer.normalize(n, java.text.Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    public static boolean existe(String nombre) {
        return PRECIOS.containsKey(clave(nombre));
    }

    public static double precioUnitario(String nombre, String tipo) {
        if (!TIPO_VACUNA.equalsIgnoreCase(tipo)) {
            throw new IllegalArgumentException("Solo se pueden registrar vacunas aplicadas.");
        }
        Double precio = PRECIOS.get(clave(nombre));
        if (precio == null) {
            throw new IllegalArgumentException("No hay un precio configurado para esa vacuna.");
        }
        return precio;
    }
}