



package Controlador;

import Modelo.CatalogoProductos;
import Modelo.Cita;
import Modelo.Cobro;
import Modelo.Consulta;
import Modelo.Empleado;
import Modelo.GestionClinica;
import Modelo.Mascota;
import Modelo.MascotaConvencional;
import Modelo.MascotaExotica;
import Modelo.Propietario;
import Modelo.Recepcionista;
import Modelo.Vacuna;
import Modelo.Veterinario;
import Vista.AgendaVeterinario;
import Vista.AgendarCita;
import Vista.AtenderConsulta;
import Vista.Cobros;
import Vista.ConsultasRealizadas;
import Vista.CrearUsuario;
import Vista.HistorialClinico;
import Vista.IniciarSesion;
import Vista.ListaCitas;
import Vista.ListaCobros;
import Vista.ListaMascotas;
import Vista.ListaPropietarios;
import Vista.PanelRecepcionista;
import Vista.PanelVeterinario;
import Vista.RegistrarMascota;
import Vista.RegistrarPropietario;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractAction;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;









public class Controlador implements ActionListener {

    private static final Logger LOG = Logger.getLogger(Controlador.class.getName());

    
    public static final String CLAVE_AUTORIZACION = "HUELLITAS2026";

    private static final String ESTADO_PENDIENTE = "Pendiente";
    private static final String ESTADO_ATENDIDA = "Atendida";
    private static final String TITULO = "Huellitas4Life";

    private static final DateTimeFormatter FMT_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_HORA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter[] FORMATOS_FECHA = {
        DateTimeFormatter.ofPattern("d/M/uuuu").withResolverStyle(ResolverStyle.STRICT),
        DateTimeFormatter.ofPattern("d-M-uuuu").withResolverStyle(ResolverStyle.STRICT),
        DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT)
    };
    private static final DateTimeFormatter FORMATO_HORA
            = DateTimeFormatter.ofPattern("H:mm").withResolverStyle(ResolverStyle.STRICT);
    private static final Pattern ENTERO_INICIAL = Pattern.compile("^\\s*(\\d+)");

    

    private final GestionClinica gestion;
    private Empleado empleado;

    
    private final Map<Class<?>, JFrame> ventanas = new HashMap<>();

    
    private List<Propietario> opcionesPropietario = new ArrayList<>();
    private List<Propietario> opcionesCitaPropietario = new ArrayList<>();
    private List<Mascota> opcionesCitaMascota = new ArrayList<>();
    private List<Veterinario> opcionesCitaVeterinario = new ArrayList<>();
    private boolean cargandoCita;
    private List<Cita> colaVeterinario = new ArrayList<>();
    private List<Consulta> consultasPendientesCobro = new ArrayList<>();
    private List<Consulta> consultasMostradas = new ArrayList<>();
    private Cita citaEnConsulta;

    public Controlador(GestionClinica gestionClinica) {
        this.gestion = gestionClinica;
    }

    

    public void iniciar() {
        abrir(IniciarSesion.class, () -> {
            IniciarSesion vista = new IniciarSesion();
            vista.setControlador(this);
            return vista;
        }, v -> { });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        try {
            switch (accion) {
                
                case "ingresar" -> manejarIngreso();
                case "crearNuevo" -> abrirCrearUsuario();
                case "crearUsuario" -> manejarCrearUsuario();
                
                case "inicio" -> refrescarVistas();
                case "abrirPropietarios" -> abrirListaPropietarios();
                case "abrirMascotas" -> abrirListaMascotas();
                case "abrirCitas" -> abrirListaCitas();
                case "abrirCobros" -> abrirListaCobros();
                case "nuevoPropietario" -> abrirRegistrarPropietario();
                case "nuevaMascota" -> abrirRegistrarMascota();
                case "nuevaCita" -> abrirAgendarCita();
                case "nuevoCobro" -> abrirCobros();
                case "abrirAgenda" -> abrirAgendaVeterinario();
                case "abrirConsultas" -> abrirConsultasRealizadas();
                case "abrirHistorial" -> abrirHistorial(null);
                case "verHistorial" -> manejarVerHistorialDesdePanel();
                case "atenderConsulta" -> abrirAtenderConsulta();
                case "verHistorialConsulta" -> manejarVerHistorialDesdeConsultas();
                
                case "guardarPropietario" -> manejarGuardarPropietario();
                case "guardarMascota" -> manejarGuardarMascota();
                case "guardarCita" -> manejarGuardarCita();
                case "generarCobro" -> manejarGenerarCobro();
                
                case "agregarProducto" -> manejarAgregarProducto();
                case "guardarConsulta" -> manejarGuardarConsulta();
                case "buscarHistorial" -> manejarBuscarHistorial();
                case "buscarConsulta" -> manejarBuscarConsulta();
                default -> LOG.log(Level.WARNING, "ActionCommand sin manejar: {0}", accion);
            }
        } catch (RuntimeException ex) {
            LOG.log(Level.SEVERE, "Error al procesar la accion " + accion, ex);
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error inesperado al procesar la accion:\n" + ex,
                    TITULO, JOptionPane.ERROR_MESSAGE);
        }
    }

    

    private void manejarIngreso() {
        IniciarSesion vista = abierta(IniciarSesion.class);
        if (vista == null) {
            return;
        }
        String usuario = vista.getTxtUsuario().getText().trim();
        String clave = vista.getTxtContra1().getText();
        if (usuario.isEmpty() || clave.isEmpty()) {
            aviso(vista, "Escribe tu usuario y tu contraseña.");
            return;
        }
        Empleado encontrado = gestion.autenticarEmpleado(usuario, clave);
        if (encontrado == null) {
            error(vista, "Usuario o contraseña incorrectos.");
            return;
        }
        boolean eligioRecep = vista.getRadioButtonRecep().isSelected();
        boolean eligioVeter = vista.getRadioButtonVeter().isSelected();
        if (eligioRecep && !(encontrado instanceof Recepcionista)) {
            error(vista, "Ese usuario no es Recepcionista. Elige el rol correcto.");
            return;
        }
        if (eligioVeter && !(encontrado instanceof Veterinario)) {
            error(vista, "Ese usuario no es Veterinario. Elige el rol correcto.");
            return;
        }
        if (!(encontrado instanceof Recepcionista) && !(encontrado instanceof Veterinario)) {
            error(vista, "El usuario no tiene un rol valido.");
            return;
        }
        empleado = encontrado;
        if (encontrado instanceof Veterinario) {
            abrirPanelVeterinario();
        } else {
            abrirPanelRecepcionista();
        }
        vista.dispose();
    }

    private void abrirCrearUsuario() {
        abrir(CrearUsuario.class, () -> {
            CrearUsuario vista = new CrearUsuario();
            vista.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            vista.setControlador(this);
            return vista;
        }, v -> { });
    }

    private void manejarCrearUsuario() {
        CrearUsuario vista = abierta(CrearUsuario.class);
        if (vista == null) {
            return;
        }
        String nombre = vista.getTxtNombre().getText().trim();
        String usuario = vista.getTxtUsuario().getText().trim();
        String clave = vista.getTxtContra().getText();
        String confirmacion = vista.getTxtConfirContra().getText();
        String autorizacion = vista.getTxtConfirContra1().getText().trim();
        String tarjeta = vista.getTxtTarjetaPro().getText().trim();
        String tipo = String.valueOf(vista.getjComboBox1().getSelectedItem());
        boolean esVeterinario = "Veterinario".equalsIgnoreCase(tipo);

        if (nombre.isEmpty() || usuario.isEmpty() || clave.isEmpty() || confirmacion.isEmpty()) {
            aviso(vista, "Completa nombre, usuario, contraseña y confirmación.");
            return;
        }
        if (!CLAVE_AUTORIZACION.equals(autorizacion)) {
            error(vista, "La clave de autorización es incorrecta. No se creó el usuario.");
            return;
        }
        if (!clave.equals(confirmacion)) {
            aviso(vista, "La contraseña y su confirmación no coinciden.");
            return;
        }
        if (esVeterinario && tarjeta.isEmpty()) {
            aviso(vista, "El veterinario debe indicar su N° de tarjeta profesional.");
            return;
        }
        for (Empleado e : gestion.getEmpleados()) {
            if (e.getUsuario().equalsIgnoreCase(usuario)) {
                aviso(vista, "Ya existe un empleado con el usuario \"" + usuario + "\". Elige otro.");
                return;
            }
        }
        
        Empleado nuevo = esVeterinario
                ? new Veterinario(nombre, "N/A", "", "", usuario, clave, "Medicina general", tarjeta)
                : new Recepcionista(nombre, "N/A", "", "", usuario, clave);
        gestion.registrarEmpleado(nuevo);
        if (!gestion.getEmpleados().contains(nuevo)) {
            error(vista, "El modelo no registró al empleado.");
            return;
        }
        info(vista, "Usuario creado. Ya puedes iniciar sesión como " + tipo + ".");
        vista.dispose();
    }

    

    private PanelRecepcionista abrirPanelRecepcionista() {
        return abrir(PanelRecepcionista.class, () -> {
            PanelRecepcionista panel = new PanelRecepcionista();
            panel.setControlador(this);
            prepararTabla(panel.getTablePrincipal());
            panel.setTitle(TITULO + " - " + empleado.getNombre());
            configurarCierreDePanel(panel);
            return panel;
        }, this::cargarPanelRecepcionista);
    }

    private PanelVeterinario abrirPanelVeterinario() {
        return abrir(PanelVeterinario.class, () -> {
            PanelVeterinario panel = new PanelVeterinario();
            panel.setControlador(this);
            prepararTabla(panel.getTableVeterinario());
            panel.setTitle(TITULO + " - " + empleado.getNombre());
            configurarCierreDePanel(panel);
            return panel;
        }, this::cargarPanelVeterinario);
    }

    



    private void configurarCierreDePanel(JFrame panel) {
        panel.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cerrarSesion();
            }
        });
    }

    private void cerrarSesion() {
        empleado = null;
        citaEnConsulta = null;
        colaVeterinario = new ArrayList<>();
        for (JFrame ventana : new ArrayList<>(ventanas.values())) {
            ventana.dispose();
        }
        ventanas.clear();
        iniciar();
    }

    private void cargarPanelRecepcionista(PanelRecepcionista panel) {
        LocalDate hoy = LocalDate.now();
        List<Cita> deHoy = new ArrayList<>();
        for (Cita c : gestion.getCitas()) {
            if (hoy.equals(c.getFecha())) {
                deHoy.add(c);
            }
        }
        deHoy.sort(Comparator.comparing(Cita::getHora));
        panel.getLblCitHoy().setText(String.format("%03d", deHoy.size()));
        panel.getLblMascotasContador().setText(String.format("%03d", gestion.getMascotas().size()));
        List<Object[]> filas = new ArrayList<>();
        for (Cita c : deHoy) {
            filas.add(new Object[]{c.getHora().format(FMT_HORA), c.getMascota().getNombre(),
                nombrePropietario(c.getMascota()), c.getMotivo()});
        }
        llenar(panel.getTablePrincipal(), filas);
    }

    private void cargarPanelVeterinario(PanelVeterinario panel) {
        Veterinario vet = (Veterinario) empleado;
        List<Cita> pendientes = new ArrayList<>();
        for (Cita c : gestion.obtenerAgendaVeterinario(vet)) {
            if (ESTADO_PENDIENTE.equalsIgnoreCase(c.getEstadoCita())) {
                pendientes.add(c);
            }
        }
        pendientes.sort(Comparator.comparing(Cita::getFecha).thenComparing(Cita::getHora));
        colaVeterinario = pendientes;

        LocalDate hoy = LocalDate.now();
        List<Mascota> mascotasHoy = new ArrayList<>();
        List<Object[]> filas = new ArrayList<>();
        int orden = 1;
        for (Cita c : pendientes) {
            if (hoy.equals(c.getFecha()) && !mascotasHoy.contains(c.getMascota())) {
                mascotasHoy.add(c.getMascota());
            }
            filas.add(new Object[]{orden++, c.getFecha().format(FMT_FECHA) + " " + c.getHora().format(FMT_HORA),
                c.getMascota().getNombre(), nombrePropietario(c.getMascota()), c.getEstadoCita()});
        }
        panel.getLblConsultHoy().setText(String.format("%03d", pendientes.size()));
        panel.getLblMascotasHoyContador().setText(String.format("%03d", mascotasHoy.size()));
        DefaultTableModel modelo = (DefaultTableModel) panel.getTableVeterinario().getModel();
        modelo.setColumnIdentifiers(new Object[]{"Orden", "Fecha y hora", "Mascota", "Propietario", "Estado"});
        llenar(panel.getTableVeterinario(), filas);
    }

    

    private void abrirListaPropietarios() {
        abrir(ListaPropietarios.class, ListaPropietarios::new, this::cargarListaPropietarios);
    }

    private void cargarListaPropietarios(ListaPropietarios vista) {
        List<Object[]> filas = new ArrayList<>();
        for (Propietario p : gestion.getPropietarios()) {
            filas.add(new Object[]{p.getNombre(), p.getCedula(), p.getTelefono(), p.getCorreo(), p.getDireccion()});
        }
        llenar(vista.getTblRegistros(), filas);
    }

    private void abrirListaMascotas() {
        abrir(ListaMascotas.class, ListaMascotas::new, this::cargarListaMascotas);
    }

    private void cargarListaMascotas(ListaMascotas vista) {
        List<Object[]> filas = new ArrayList<>();
        for (Mascota m : gestion.getMascotas()) {
            filas.add(new Object[]{m.getNombre(), especieDe(m), tipoDe(m), m.getEdad() + " años",
                String.format(Locale.ROOT, "%.1f kg", m.getPeso()), nombrePropietario(m)});
        }
        llenar(vista.getTblRegistros(), filas);
    }

    private void abrirListaCitas() {
        abrir(ListaCitas.class, ListaCitas::new, this::cargarListaCitas);
    }

    private void cargarListaCitas(ListaCitas vista) {
        List<Cita> citas = new ArrayList<>(gestion.getCitas());
        citas.sort(Comparator.comparing(Cita::getFecha).thenComparing(Cita::getHora));
        List<Object[]> filas = new ArrayList<>();
        for (Cita c : citas) {
            filas.add(new Object[]{c.getFecha().format(FMT_FECHA), c.getHora().format(FMT_HORA),
                c.getMascota().getNombre(), nombrePropietario(c.getMascota()),
                c.getVeterinario().getNombre(), c.getMotivo(), c.getEstadoCita()});
        }
        llenar(vista.getTblRegistros(), filas);
    }

    private void abrirListaCobros() {
        abrir(ListaCobros.class, ListaCobros::new, this::cargarListaCobros);
    }

    private void cargarListaCobros(ListaCobros vista) {
        List<Object[]> filas = new ArrayList<>();
        int numero = 1;
        for (Cobro cobro : gestion.getCobros()) {
            Consulta c = cobro.getConsulta();
            int productos = c.getVacunas().size();
            String concepto = "Consulta veterinaria" + (productos > 0 ? " + " + productos + " producto(s)" : "");
            filas.add(new Object[]{String.format("CB-%04d", numero++), c.getFecha().format(FMT_FECHA),
                nombrePropietario(c.getMascota()), c.getMascota().getNombre(), concepto,
                dinero(cobro.getTotal()), "Cobrado"});
        }
        llenar(vista.getTblRegistros(), filas);
    }

    

    

    private void abrirRegistrarPropietario() {
        abrir(RegistrarPropietario.class, () -> {
            RegistrarPropietario vista = new RegistrarPropietario();
            vista.setControlador(this);
            return vista;
        }, v -> { });
    }

    private void manejarGuardarPropietario() {
        RegistrarPropietario vista = abierta(RegistrarPropietario.class);
        if (vista == null) {
            return;
        }
        String nombre = vista.getTxtNombrePropietario().getText().trim();
        String cedula = vista.getTxtCedula().getText().trim();
        String telefono = vista.getTxtTelefono().getText().trim();
        String correo = vista.getTxtCorreo().getText().trim();
        String direccion = vista.getTxtDireccion().getText().trim();

        if (nombre.isEmpty() || cedula.isEmpty() || telefono.isEmpty()) {
            aviso(vista, "Nombre, cédula y teléfono son obligatorios.");
            return;
        }
        if (!cedula.matches("[A-Za-z0-9]{5,}")) {
            aviso(vista, "La cédula solo puede tener letras y números (mínimo 5 caracteres).");
            return;
        }
        if (telefono.replaceAll("\\D", "").length() < 7) {
            aviso(vista, "El teléfono debe tener al menos 7 dígitos.");
            return;
        }
        if (!correo.isEmpty() && !correo.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            aviso(vista, "El correo electrónico no es válido.");
            return;
        }
        if (gestion.buscarPropietarioPorCedula(cedula) != null) {
            error(vista, "Ya existe un propietario con la cédula " + cedula + ".");
            return;
        }
        
        Propietario nuevo = new Propietario(nombre, cedula, correo, telefono, cedula, direccion);
        gestion.registrarPropietario(nuevo);
        if (gestion.buscarPropietarioPorCedula(cedula) != nuevo) {
            error(vista, "El modelo no registró al propietario.");
            return;
        }
        info(vista, "Propietario registrado: " + nombre + ".");
        vista.dispose();
        refrescarVistas();
    }

    

    private void abrirRegistrarMascota() {
        abrir(RegistrarMascota.class, () -> {
            RegistrarMascota vista = new RegistrarMascota();
            vista.setControlador(this);
            return vista;
        }, this::cargarPropietariosEnMascota);
    }

    private void cargarPropietariosEnMascota(RegistrarMascota vista) {
        int indice = vista.getCmbPropietario().getSelectedIndex();
        Propietario seleccionado = (indice > 0 && indice <= opcionesPropietario.size())
                ? opcionesPropietario.get(indice - 1) : null;

        opcionesPropietario = new ArrayList<>(gestion.getPropietarios());
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Seleccione propietario");
        for (Propietario p : opcionesPropietario) {
            modelo.addElement(p.getNombre() + " - " + p.getCedula());
        }
        vista.getCmbPropietario().setModel(modelo);
        if (seleccionado != null && opcionesPropietario.contains(seleccionado)) {
            vista.getCmbPropietario().setSelectedIndex(opcionesPropietario.indexOf(seleccionado) + 1);
        }
    }

    private void manejarGuardarMascota() {
        RegistrarMascota vista = abierta(RegistrarMascota.class);
        if (vista == null) {
            return;
        }
        int indice = vista.getCmbPropietario().getSelectedIndex();
        if (indice <= 0 || indice > opcionesPropietario.size()) {
            aviso(vista, "Selecciona el propietario de la mascota.\n"
                    + "Si aún no está registrado, regístralo primero.");
            return;
        }
        Propietario propietario = opcionesPropietario.get(indice - 1);

        String nombre = vista.getTxtNombreMascota().getText().trim();
        if (nombre.isEmpty()) {
            aviso(vista, "Escribe el nombre de la mascota.");
            return;
        }
        if (vista.getCmbEspecie().getSelectedIndex() <= 0) {
            aviso(vista, "Selecciona la especie.");
            return;
        }
        String especie = String.valueOf(vista.getCmbEspecie().getSelectedItem());

        Integer edadIngresada = parseEntero(vista.getTxtEdad().getText());
        if (edadIngresada == null || edadIngresada < 0) {
            aviso(vista, "La edad debe ser un número entero (0 o más).");
            return;
        }
        
        boolean enMeses = "meses".equalsIgnoreCase(String.valueOf(vista.getCmbUnidadEdad().getSelectedItem()));
        int edadAnios = enMeses ? edadIngresada / 12 : edadIngresada;

        Double pesoIngresado = parseDecimal(vista.getTxtPeso().getText());
        if (pesoIngresado == null || pesoIngresado <= 0) {
            aviso(vista, "El peso debe ser un número mayor que 0.");
            return;
        }
        boolean enGramos = "g".equalsIgnoreCase(String.valueOf(vista.getCmbUnidadPeso().getSelectedItem()));
        double pesoKg = enGramos ? pesoIngresado / 1000.0 : pesoIngresado;

        for (Mascota existente : propietario.getMascotas()) {
            if (existente.getNombre().equalsIgnoreCase(nombre)) {
                error(vista, propietario.getNombre() + " ya tiene una mascota llamada " + nombre + ".");
                return;
            }
        }

        String id = siguienteIdMascota();
        Mascota mascota;
        if (vista.getRbtnExotica().isSelected()) {
            String permiso = vista.getTxtPermisoICA().getText().trim();
            if (permiso.isEmpty()) {
                aviso(vista, "Las mascotas exóticas requieren el número de permiso.");
                return;
            }
            mascota = new MascotaExotica(id, nombre, edadAnios, pesoKg, propietario, especie, permiso,
                    vista.getChkSedacion().isSelected());
        } else if (vista.getRbtnConvencional().isSelected()) {
            if (vista.getCmbRaza().getSelectedIndex() <= 0) {
                aviso(vista, "Selecciona la raza de la mascota convencional.");
                return;
            }
            String raza = String.valueOf(vista.getCmbRaza().getSelectedItem());
            mascota = new MascotaConvencional(id, nombre, edadAnios, pesoKg, propietario, especie, raza,
                    leerEsquemaVacunas(vista.getTxtVacunas().getText()));
        } else {
            aviso(vista, "Indica si la mascota es convencional o exótica.");
            return;
        }

        if (!gestion.registrarMascota(mascota)) {
            error(vista, "No se pudo registrar la mascota (el identificador " + id + " ya existe).");
            return;
        }
        info(vista, "Mascota registrada: " + nombre + " (ID " + id + ") de " + propietario.getNombre() + ".");
        vista.dispose();
        refrescarVistas();
    }

    private List<Vacuna> leerEsquemaVacunas(String texto) {
        List<Vacuna> esquema = new ArrayList<>();
        for (String parte : texto.split("[,;\\n]+")) {
            String nombre = parte.trim();
            if (!nombre.isEmpty()) {
                esquema.add(new Vacuna(nombre, 0.0, 1, CatalogoProductos.TIPO_VACUNA));
            }
        }
        return esquema;
    }

    

    private void abrirAgendarCita() {
        abrir(AgendarCita.class, () -> {
            AgendarCita vista = new AgendarCita();
            vista.setControlador(this);
            
            vista.getCmbPropietario().addActionListener(ev -> {
                if (!cargandoCita) {
                    cargarMascotasDeCita(vista);
                }
            });
            return vista;
        }, this::cargarOpcionesCita);
    }

    
    private void cargarOpcionesCita(AgendarCita vista) {
        cargandoCita = true;
        try {
            int ip = vista.getCmbPropietario().getSelectedIndex();
            Propietario propietarioPrevio = (ip > 0 && ip <= opcionesCitaPropietario.size())
                    ? opcionesCitaPropietario.get(ip - 1) : null;
            int iv = vista.getCmbVeterinario().getSelectedIndex();
            Veterinario veterinarioPrevio = (iv > 0 && iv <= opcionesCitaVeterinario.size())
                    ? opcionesCitaVeterinario.get(iv - 1) : null;

            opcionesCitaPropietario = new ArrayList<>(gestion.getPropietarios());
            DefaultComboBoxModel<String> modeloPropietarios = new DefaultComboBoxModel<>();
            modeloPropietarios.addElement("Seleccione propietario");
            for (Propietario p : opcionesCitaPropietario) {
                modeloPropietarios.addElement(p.getNombre() + " - " + p.getCedula());
            }
            vista.getCmbPropietario().setModel(modeloPropietarios);
            if (propietarioPrevio != null && opcionesCitaPropietario.contains(propietarioPrevio)) {
                vista.getCmbPropietario().setSelectedIndex(opcionesCitaPropietario.indexOf(propietarioPrevio) + 1);
            }

            opcionesCitaVeterinario = new ArrayList<>();
            for (Empleado e : gestion.getEmpleados()) {
                if (e instanceof Veterinario v) {
                    opcionesCitaVeterinario.add(v);
                }
            }
            DefaultComboBoxModel<String> modeloVeterinarios = new DefaultComboBoxModel<>();
            modeloVeterinarios.addElement("Seleccione veterinario");
            for (Veterinario v : opcionesCitaVeterinario) {
                modeloVeterinarios.addElement(v.getNombre());
            }
            vista.getCmbVeterinario().setModel(modeloVeterinarios);
            if (veterinarioPrevio != null && opcionesCitaVeterinario.contains(veterinarioPrevio)) {
                vista.getCmbVeterinario().setSelectedIndex(opcionesCitaVeterinario.indexOf(veterinarioPrevio) + 1);
            }
        } finally {
            cargandoCita = false;
        }
        cargarMascotasDeCita(vista);
    }

    
    private void cargarMascotasDeCita(AgendarCita vista) {
        int ip = vista.getCmbPropietario().getSelectedIndex();
        Propietario propietario = (ip > 0 && ip <= opcionesCitaPropietario.size())
                ? opcionesCitaPropietario.get(ip - 1) : null;
        int im = vista.getCmbMascota().getSelectedIndex();
        Mascota previa = (im > 0 && im <= opcionesCitaMascota.size()) ? opcionesCitaMascota.get(im - 1) : null;

        opcionesCitaMascota = propietario == null ? new ArrayList<>() : new ArrayList<>(propietario.getMascotas());
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Seleccione mascota");
        for (Mascota m : opcionesCitaMascota) {
            modelo.addElement(m.getNombre() + " (" + especieDe(m) + ")");
        }
        vista.getCmbMascota().setModel(modelo);
        if (previa != null && opcionesCitaMascota.contains(previa)) {
            vista.getCmbMascota().setSelectedIndex(opcionesCitaMascota.indexOf(previa) + 1);
        } else if (opcionesCitaMascota.size() == 1) {
            vista.getCmbMascota().setSelectedIndex(1);
        }
    }

    private void manejarGuardarCita() {
        AgendarCita vista = abierta(AgendarCita.class);
        if (vista == null) {
            return;
        }
        int ip = vista.getCmbPropietario().getSelectedIndex();
        if (ip <= 0 || ip > opcionesCitaPropietario.size()) {
            aviso(vista, opcionesCitaPropietario.isEmpty()
                    ? "Aún no hay propietarios registrados. Registra uno primero."
                    : "Selecciona el propietario.");
            return;
        }
        Propietario propietario = opcionesCitaPropietario.get(ip - 1);

        int im = vista.getCmbMascota().getSelectedIndex();
        if (opcionesCitaMascota.isEmpty()) {
            aviso(vista, propietario.getNombre() + " aún no tiene mascotas registradas. Regístralas primero.");
            return;
        }
        if (im <= 0 || im > opcionesCitaMascota.size()) {
            aviso(vista, "Selecciona la mascota.");
            return;
        }
        Mascota mascota = opcionesCitaMascota.get(im - 1);

        int iv = vista.getCmbVeterinario().getSelectedIndex();
        if (iv <= 0 || iv > opcionesCitaVeterinario.size()) {
            aviso(vista, opcionesCitaVeterinario.isEmpty()
                    ? "Aún no hay veterinarios registrados. Crea uno desde el inicio de sesión."
                    : "Selecciona el veterinario.");
            return;
        }
        Veterinario veterinario = opcionesCitaVeterinario.get(iv - 1);

        String textoFecha = vista.getTxtFecha().getText().trim();
        String textoHora = vista.getTxtHora().getText().trim();
        String motivo = vista.getTxtMotivo().getText().trim();
        if (textoFecha.isEmpty() || textoHora.isEmpty() || motivo.isEmpty()) {
            aviso(vista, "Completa fecha, hora y motivo.");
            return;
        }
        LocalDate fecha = parseFecha(textoFecha);
        if (fecha == null) {
            aviso(vista, "Fecha no válida. Usa dd/MM/aaaa, por ejemplo 25/11/2026.");
            return;
        }
        LocalTime hora = parseHora(textoHora);
        if (hora == null) {
            aviso(vista, "Hora no válida. Usa HH:mm, por ejemplo 14:30.");
            return;
        }
        if (fecha.isBefore(LocalDate.now())) {
            aviso(vista, "La fecha de la cita no puede estar en el pasado.");
            return;
        }
        for (Cita existente : gestion.getCitas()) {
            if (existente.getVeterinario() == veterinario && existente.getFecha().equals(fecha)
                    && existente.getHora().equals(hora)) {
                error(vista, veterinario.getNombre() + " ya tiene una cita el "
                        + fecha.format(FMT_FECHA) + " a las " + hora.format(FMT_HORA) + ".");
                return;
            }
        }
        Cita cita = new Cita(siguienteIdCita(), fecha, hora, motivo, ESTADO_PENDIENTE, mascota, veterinario);
        gestion.agendarCita(cita);
        if (!gestion.getCitas().contains(cita)) {
            error(vista, "El modelo no agendó la cita.");
            return;
        }
        info(vista, "Cita " + cita.getId() + " agendada para " + mascota.getNombre() + " con "
                + veterinario.getNombre() + " el " + fecha.format(FMT_FECHA) + " a las " + hora.format(FMT_HORA) + ".");
        vista.dispose();
        refrescarVistas();
    }

    

    private void abrirCobros() {
        abrir(Cobros.class, () -> {
            Cobros vista = new Cobros();
            vista.setControlador(this);
            prepararCobros(vista);
            return vista;
        }, this::cargarCobrosPendientes);
    }

    private void prepararCobros(Cobros vista) {
        prepararTabla(vista.getTblPendientes());
        prepararTabla(vista.getTblDetalleCobro());
        vista.getTxtTarifaBase().setEditable(false);
        vista.getTxtRecargo().setEditable(false);
        vista.getTxtTotal().setEditable(false);
        vista.getChkDescuento().setSelected(false);
        vista.getChkDescuento().setEnabled(false);
        vista.getChkDescuento().addActionListener(ev -> actualizarSeleccionCobro(vista));
        

        vista.getTblPendientes().getSelectionModel().addListSelectionListener(ev -> {
            if (!ev.getValueIsAdjusting()) {
                mostrarSeleccionPendiente(vista);
            }
        });
    }

    private void cargarCobrosPendientes(Cobros vista) {
        int fila = vista.getTblPendientes().getSelectedRow();
        Consulta anterior = (fila >= 0 && fila < consultasPendientesCobro.size())
                ? consultasPendientesCobro.get(fila) : null;

        consultasPendientesCobro = new ArrayList<>();
        List<Object[]> filas = new ArrayList<>();
        for (Consulta c : gestion.getConsultas()) {
            if (!yaCobrada(c)) {
                consultasPendientesCobro.add(c);
                filas.add(new Object[]{numeroConsulta(c), c.getFecha().format(FMT_FECHA),
                    c.getMascota().getNombre(), nombrePropietario(c.getMascota()),
                    resumenProductos(c.getVacunas())});
            }
        }
        llenar(vista.getTblPendientes(), filas);
        int nueva = anterior == null ? -1 : consultasPendientesCobro.indexOf(anterior);
        if (nueva >= 0) {
            vista.getTblPendientes().setRowSelectionInterval(nueva, nueva);
        } else {
            limpiarDetalleCobro(vista);
        }
    }

    private void mostrarSeleccionPendiente(Cobros vista) {
        int fila = vista.getTblPendientes().getSelectedRow();
        if (fila < 0 || fila >= consultasPendientesCobro.size()) {
            limpiarDetalleCobro(vista);
            return;
        }
        Consulta consulta = consultasPendientesCobro.get(fila);
        vista.getChkDescuento().setSelected(false);
        vista.getChkDescuento().setEnabled(puedeAplicarDescuento(consulta));
        actualizarVistaPreviaCobro(vista, consulta);
    }

    private void actualizarSeleccionCobro(Cobros vista) {
        int fila = vista.getTblPendientes().getSelectedRow();
        if (fila < 0 || fila >= consultasPendientesCobro.size()) {
            limpiarDetalleCobro(vista);
            return;
        }
        Consulta consulta = consultasPendientesCobro.get(fila);
        boolean elegible = puedeAplicarDescuento(consulta);
        if (!elegible) {
            vista.getChkDescuento().setSelected(false);
        }
        vista.getChkDescuento().setEnabled(elegible);
        actualizarVistaPreviaCobro(vista, consulta);
    }

    private boolean puedeAplicarDescuento(Consulta consulta) {
        return consulta != null
                && consulta.getMascota() != null
                && consulta.getMascota().getPropietario() != null
                && consulta.getMascota().getPropietario().tieneMasDeDosMascotas();
    }

    private void actualizarVistaPreviaCobro(Cobros vista, Consulta consulta) {
        boolean aplicarDescuento = vista.getChkDescuento().isSelected()
                && puedeAplicarDescuento(consulta);
        Cobro previa = new Cobro(consulta, gestion.getTarifaBase(),
                gestion.getValorSedacionFija(), aplicarDescuento);
        mostrarCobro(vista, consulta, previa);
    }

    private void mostrarCobro(Cobros vista, Consulta consulta, Cobro cobro) {
        List<Object[]> filas = new ArrayList<>();
        for (Vacuna v : consulta.getVacunas()) {
            filas.add(new Object[]{v.getTipo(), v.getNombre(), v.getDosis() + (v.getDosis() == 1 ? " unidad" : " unidades"),
                v.getDosis(), dinero(v.getCosto()), dinero(v.getCosto() * v.getDosis())});
        }
        llenar(vista.getTblDetalleCobro(), filas);
        vista.getTxtTarifaBase().setText(dinero(cobro.getTarifaBase()));
        vista.getTxtRecargo().setText(dinero(cobro.getRecargo()));
        vista.getTxtTotal().setText(dinero(cobro.getTotal()));

    }

    private void limpiarDetalleCobro(Cobros vista) {
        llenar(vista.getTblDetalleCobro(), new ArrayList<>());
        vista.getTxtTarifaBase().setText("");
        vista.getTxtRecargo().setText("");
        vista.getTxtTotal().setText("");
        vista.getChkDescuento().setSelected(false);
        vista.getChkDescuento().setEnabled(false);
    }

    private void manejarGenerarCobro() {
        Cobros vista = abierta(Cobros.class);
        if (vista == null) {
            return;
        }
        int fila = vista.getTblPendientes().getSelectedRow();
        if (fila < 0 || fila >= consultasPendientesCobro.size()) {
            aviso(vista, "Selecciona una consulta pendiente de cobro.");
            return;
        }
        Consulta consulta = consultasPendientesCobro.get(fila);
        if (yaCobrada(consulta)) {
            aviso(vista, "Esa consulta ya fue cobrada.");
            cargarCobrosPendientes(vista);
            return;
        }
        boolean aplicarDescuento = vista.getChkDescuento().isSelected();
        if (aplicarDescuento && !puedeAplicarDescuento(consulta)) {
            aviso(vista, "El descuento solo aplica si el propietario tiene más de dos mascotas.");
            vista.getChkDescuento().setSelected(false);
            return;
        }
        Cobro cobro = gestion.generarCobro(consulta, aplicarDescuento);
        if (cobro == null) {
            error(vista, "El modelo no generó el cobro.");
            return;
        }
        refrescarVistas();
        mostrarCobro(vista, consulta, cobro);
        vista.getChkDescuento().setSelected(cobro.getDescuento() > 0);
        vista.getChkDescuento().setEnabled(false);

        int numero = gestion.getCobros().indexOf(cobro) + 1;
        String descuentoTexto = cobro.getDescuento() > 0
                ? "Descuento " + (int) cobro.getDescuento() + "% (más de 2 mascotas): -" + dinero(cobro.calcularDescuentoDinero())
                : "Descuento: no aplica";
        info(vista, String.format("Comprobante CB-%04d%n%nMascota: %s (%s)%n%nTarifa base: %s%nProductos aplicados: %s%n"
                + "Recargo exótico: %s%nSedación: %s%nSubtotal: %s%n%s%n%nTOTAL A PAGAR: %s",
                numero, consulta.getMascota().getNombre(), nombrePropietario(consulta.getMascota()),
                dinero(cobro.getTarifaBase()), dinero(cobro.getCostoVacunas()), dinero(cobro.getRecargo()),
                dinero(cobro.getCostoSedacion()), dinero(cobro.calcularSubtotal()), descuentoTexto,
                dinero(cobro.getTotal())));
    }

    

    private Veterinario veterinarioActual() {
        if (empleado instanceof Veterinario vet) {
            return vet;
        }
        aviso(null, "Esta acción es solo para veterinarios.");
        return null;
    }

    

    private void abrirAgendaVeterinario() {
        if (veterinarioActual() == null) {
            return;
        }
        abrir(AgendaVeterinario.class, AgendaVeterinario::new, this::cargarAgenda);
    }

    private void cargarAgenda(AgendaVeterinario vista) {
        Veterinario vet = (Veterinario) empleado;
        List<Cita> agenda = new ArrayList<>(gestion.obtenerAgendaVeterinario(vet));
        agenda.sort(Comparator.comparing(Cita::getFecha).thenComparing(Cita::getHora));
        List<Object[]> filas = new ArrayList<>();
        for (Cita c : agenda) {
            filas.add(new Object[]{c.getFecha().format(FMT_FECHA), c.getHora().format(FMT_HORA),
                c.getMascota().getNombre(), nombrePropietario(c.getMascota()), c.getMotivo(), c.getEstadoCita()});
        }
        llenar(vista.getTblRegistros(), filas);
    }

    

    private void abrirAtenderConsulta() {
        if (veterinarioActual() == null) {
            return;
        }
        PanelVeterinario panel = abierta(PanelVeterinario.class);
        if (panel == null) {
            return;
        }
        int fila = panel.getTableVeterinario().getSelectedRow();
        if (fila < 0 || fila >= colaVeterinario.size()) {
            aviso(panel, "Selecciona en la cola de atención la cita que vas a atender.");
            return;
        }
        Cita cita = colaVeterinario.get(fila);
        if (!ESTADO_PENDIENTE.equalsIgnoreCase(cita.getEstadoCita())) {
            aviso(panel, "Esa cita ya fue atendida.");
            refrescarVistas();
            return;
        }
        AtenderConsulta previa = abierta(AtenderConsulta.class);
        if (previa != null) {
            previa.dispose();
        }
        citaEnConsulta = cita;
        abrir(AtenderConsulta.class, () -> {
            AtenderConsulta vista = new AtenderConsulta();
            vista.setControlador(this);
            prepararAtencion(vista);
            return vista;
        }, this::cargarAtencion);
    }

    private void prepararAtencion(AtenderConsulta vista) {
        vista.getTxtMascotaSeleccionada().setEditable(false);
        vista.getTxtPropietario().setEditable(false);
        vista.getTxtEspecieTipo().setEditable(false);
        vista.getTxtEdadMascota().setEditable(false);
        vista.getTxtPesoMascota().setEditable(false);
        @SuppressWarnings("unchecked")
        javax.swing.JComboBox<String> combo = vista.getCmbTipoProducto();
        if (combo.getItemCount() == 0) {
            combo.setModel(new DefaultComboBoxModel<>(CatalogoProductos.TIPOS));
        }
        JTable tabla = vista.getTblProductos();
        prepararTabla(tabla);
        tabla.setToolTipText("Selecciona una fila y presiona Supr para quitarla");
        tabla.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "quitarFila");
        tabla.getActionMap().put("quitarFila", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = tabla.getSelectedRow();
                if (fila >= 0) {
                    ((DefaultTableModel) tabla.getModel()).removeRow(fila);
                }
            }
        });
    }

    private void cargarAtencion(AtenderConsulta vista) {
        Cita cita = citaEnConsulta;
        Mascota m = cita.getMascota();
        vista.getTxtMascotaSeleccionada().setText(m.getNombre());
        vista.getTxtPropietario().setText(nombrePropietario(m));
        vista.getTxtEspecieTipo().setText(especieDe(m) + " (" + tipoDe(m) + ")");
        vista.getTxtEdadMascota().setText(m.getEdad() + " años");
        vista.getTxtPesoMascota().setText(String.format(Locale.ROOT, "%.1f kg", m.getPeso()));
        vista.getTxtDiagnostico().setText("");
        vista.getTxtNotas().setText("");
        vista.getTxtProducto().setText("");
        vista.getTxtDosis().setText("");
        llenar(vista.getTblProductos(), new ArrayList<>());
    }

    private void manejarAgregarProducto() {
        AtenderConsulta vista = abierta(AtenderConsulta.class);
        if (vista == null) {
            return;
        }
        String producto = vista.getTxtProducto().getText().trim();
        String dosis = vista.getTxtDosis().getText().trim();
        if (producto.isEmpty()) {
            aviso(vista, "Escribe el nombre del producto.");
            return;
        }
        Integer cantidad = cantidadDe(dosis);
        if (cantidad == null || cantidad < 1) {
            aviso(vista, "La dosis debe empezar con un número entero mayor que 0 (por ejemplo \"2\" o \"2 dosis\").");
            return;
        }
        String tipo = String.valueOf(vista.getCmbTipoProducto().getSelectedItem());
        ((DefaultTableModel) vista.getTblProductos().getModel())
                .addRow(new Object[]{tipo, producto, dosis, cantidad});
        vista.getTxtProducto().setText("");
        vista.getTxtDosis().setText("");
        vista.getTxtProducto().requestFocusInWindow();
    }

    private void manejarGuardarConsulta() {
        AtenderConsulta vista = abierta(AtenderConsulta.class);
        Veterinario vet = veterinarioActual();
        if (vista == null || vet == null) {
            return;
        }
        Cita cita = citaEnConsulta;
        if (cita == null) {
            error(vista, "No hay una cita seleccionada. Cierra esta ventana y elige una desde la cola.");
            return;
        }
        if (ESTADO_ATENDIDA.equalsIgnoreCase(cita.getEstadoCita()) || existeConsultaDeCita(cita)) {
            aviso(vista, "Esta cita ya fue atendida.");
            return;
        }
        if (cita.getVeterinario() != vet) {
            error(vista, "Esta cita está asignada a otro veterinario.");
            return;
        }
        String diagnostico = vista.getTxtDiagnostico().getText().trim();
        if (diagnostico.isEmpty()) {
            aviso(vista, "Escribe el diagnóstico.");
            return;
        }
        if (!vista.getTxtProducto().getText().trim().isEmpty() || !vista.getTxtDosis().getText().trim().isEmpty()) {
            aviso(vista, "Tienes un producto escrito sin agregar. Presiona \"Agregar\" o borra esos campos.");
            return;
        }
        String notas = vista.getTxtNotas().getText().trim();

        
        List<Vacuna> aplicadas = new ArrayList<>();
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblProductos().getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            String tipo = String.valueOf(tabla.getValueAt(i, 0));
            String nombre = String.valueOf(tabla.getValueAt(i, 1));
            int cantidad = Integer.parseInt(String.valueOf(tabla.getValueAt(i, 3)));
            if (!CatalogoProductos.TIPO_VACUNA.equalsIgnoreCase(tipo)
                    || !CatalogoProductos.existe(nombre)) {
                aviso(vista, "No hay un precio configurado para la vacuna: " + nombre + ".");
                return;
            }
            aplicadas.add(new Vacuna(nombre,
                    CatalogoProductos.precioUnitario(nombre, tipo), cantidad, tipo));
        }
        
        Consulta consulta = vet.registrarConsulta(LocalDate.now(), cita.getMascota(), diagnostico, notas, aplicadas, cita);
        gestion.registrarConsulta(consulta);

        citaEnConsulta = null;
        info(vista, "Consulta registrada para " + cita.getMascota().getNombre()
                + ".\nLa cita quedó como Atendida y la consulta está pendiente de cobro.");
        vista.dispose();
        refrescarVistas();
    }

    private boolean existeConsultaDeCita(Cita cita) {
        for (Consulta c : gestion.getConsultas()) {
            if (c.getCita() == cita) {
                return true;
            }
        }
        return false;
    }

    

    private void abrirConsultasRealizadas() {
        if (veterinarioActual() == null) {
            return;
        }
        abrir(ConsultasRealizadas.class, () -> {
            ConsultasRealizadas vista = new ConsultasRealizadas();
            vista.setControlador(this);
            prepararTabla(vista.getTblConsultas());
            return vista;
        }, v -> cargarConsultasRealizadas(v, v.getTxtBuscarMascota().getText()));
    }

    private void manejarBuscarConsulta() {
        ConsultasRealizadas vista = abierta(ConsultasRealizadas.class);
        if (vista != null) {
            cargarConsultasRealizadas(vista, vista.getTxtBuscarMascota().getText());
        }
    }

    private void cargarConsultasRealizadas(ConsultasRealizadas vista, String filtro) {
        Veterinario vet = (Veterinario) empleado;
        String buscado = normalizar(filtro);
        consultasMostradas = new ArrayList<>();
        List<Object[]> filas = new ArrayList<>();
        for (Consulta c : gestion.getConsultas()) {
            if (c.getVeterinario() != vet) {
                continue;
            }
            if (!buscado.isEmpty() && !normalizar(c.getMascota().getNombre()).contains(buscado)) {
                continue;
            }
            consultasMostradas.add(c);
            filas.add(new Object[]{numeroConsulta(c), c.getFecha().format(FMT_FECHA), c.getMascota().getNombre(),
                nombrePropietario(c.getMascota()), c.getDiagnostico(),
                yaCobrada(c) ? "Cobrada" : "Pendiente de cobro"});
        }
        llenar(vista.getTblConsultas(), filas);
    }

    private void manejarVerHistorialDesdeConsultas() {
        ConsultasRealizadas vista = abierta(ConsultasRealizadas.class);
        if (vista == null) {
            return;
        }
        int fila = vista.getTblConsultas().getSelectedRow();
        Mascota mascota = (fila >= 0 && fila < consultasMostradas.size())
                ? consultasMostradas.get(fila).getMascota() : null;
        abrirHistorial(mascota);
    }

    private void manejarVerHistorialDesdePanel() {
        PanelVeterinario panel = abierta(PanelVeterinario.class);
        Mascota mascota = null;
        if (panel != null) {
            int fila = panel.getTableVeterinario().getSelectedRow();
            if (fila >= 0 && fila < colaVeterinario.size()) {
                mascota = colaVeterinario.get(fila).getMascota();
            }
        }
        abrirHistorial(mascota);
    }

    
    private void abrirHistorial(Mascota mascota) {
        if (veterinarioActual() == null) {
            return;
        }
        HistorialClinico vista = abrir(HistorialClinico.class, () -> {
            HistorialClinico nueva = new HistorialClinico();
            nueva.setControlador(this);
            prepararTabla(nueva.getTblHistorial());
            return nueva;
        }, v -> { });
        if (mascota != null) {
            vista.getTxtBuscarMascota().setText(mascota.getNombre());
            List<Mascota> unica = new ArrayList<>();
            unica.add(mascota);
            cargarHistorial(vista, unica);
        } else {
            cargarHistorial(vista, mascotasQueCoinciden(vista.getTxtBuscarMascota().getText()));
        }
    }

    private void manejarBuscarHistorial() {
        HistorialClinico vista = abierta(HistorialClinico.class);
        if (vista == null) {
            return;
        }
        String texto = vista.getTxtBuscarMascota().getText().trim();
        List<Mascota> coincidencias = mascotasQueCoinciden(texto);
        if (!texto.isEmpty() && coincidencias.isEmpty()) {
            info(vista, "No hay mascotas que coincidan con \"" + texto + "\".");
        }
        cargarHistorial(vista, coincidencias);
    }

    private List<Mascota> mascotasQueCoinciden(String texto) {
        String buscado = normalizar(texto);
        List<Mascota> resultado = new ArrayList<>();
        for (Mascota m : gestion.getMascotas()) {
            if (buscado.isEmpty() || normalizar(m.getNombre()).contains(buscado)
                    || m.getId().equalsIgnoreCase(texto.trim())) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    private void cargarHistorial(HistorialClinico vista, List<Mascota> mascotas) {
        List<Object[]> filas = new ArrayList<>();
        for (Mascota m : mascotas) {
            for (Consulta c : m.getHistorial().listarConsulta()) {
                filas.add(new Object[]{c.getFecha().format(FMT_FECHA), m.getNombre(), nombrePropietario(m),
                    c.getDiagnostico(), resumenProductos(c.getVacunas()), c.getNotaMedica()});
            }
        }
        llenar(vista.getTblHistorial(), filas);
    }

    

    
    private void refrescarVistas() {
        PanelRecepcionista pr = abierta(PanelRecepcionista.class);
        if (pr != null) {
            cargarPanelRecepcionista(pr);
        }
        PanelVeterinario pv = abierta(PanelVeterinario.class);
        if (pv != null && empleado instanceof Veterinario) {
            cargarPanelVeterinario(pv);
        }
        ListaPropietarios lp = abierta(ListaPropietarios.class);
        if (lp != null) {
            cargarListaPropietarios(lp);
        }
        ListaMascotas lm = abierta(ListaMascotas.class);
        if (lm != null) {
            cargarListaMascotas(lm);
        }
        ListaCitas lc = abierta(ListaCitas.class);
        if (lc != null) {
            cargarListaCitas(lc);
        }
        ListaCobros lcb = abierta(ListaCobros.class);
        if (lcb != null) {
            cargarListaCobros(lcb);
        }
        RegistrarMascota rm = abierta(RegistrarMascota.class);
        if (rm != null) {
            cargarPropietariosEnMascota(rm);
        }
        AgendarCita acita = abierta(AgendarCita.class);
        if (acita != null) {
            cargarOpcionesCita(acita);
        }
        Cobros cb = abierta(Cobros.class);
        if (cb != null) {
            cargarCobrosPendientes(cb);
        }
        if (empleado instanceof Veterinario) {
            AgendaVeterinario ag = abierta(AgendaVeterinario.class);
            if (ag != null) {
                cargarAgenda(ag);
            }
            ConsultasRealizadas cr = abierta(ConsultasRealizadas.class);
            if (cr != null) {
                cargarConsultasRealizadas(cr, cr.getTxtBuscarMascota().getText());
            }
            HistorialClinico hc = abierta(HistorialClinico.class);
            if (hc != null) {
                cargarHistorial(hc, mascotasQueCoinciden(hc.getTxtBuscarMascota().getText()));
            }
        }
    }

    

    



    private <T extends JFrame> T abrir(Class<T> clase, Supplier<T> fabrica, Consumer<T> alMostrar) {
        T vista = abierta(clase);
        if (vista != null) {
            alMostrar.accept(vista);
            vista.toFront();
            return vista;
        }
        T nueva = fabrica.get();
        ventanas.put(clase, nueva);
        nueva.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ventanas.remove(clase, nueva);
            }
        });
        alMostrar.accept(nueva);
        nueva.setLocationRelativeTo(null);
        nueva.setVisible(true);
        return nueva;
    }

    private <T extends JFrame> T abierta(Class<T> clase) {
        JFrame vista = ventanas.get(clase);
        return (vista != null && vista.isDisplayable()) ? clase.cast(vista) : null;
    }

    private void prepararTabla(JTable tabla) {
        tabla.setDefaultEditor(Object.class, null);
        tabla.setRowSelectionAllowed(true);
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void llenar(JTable tabla, List<Object[]> filas) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        for (Object[] fila : filas) {
            modelo.addRow(fila);
        }
    }

    private void info(Component padre, String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, TITULO, JOptionPane.INFORMATION_MESSAGE);
    }

    private void aviso(Component padre, String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, TITULO, JOptionPane.WARNING_MESSAGE);
    }

    private void error(Component padre, String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, TITULO, JOptionPane.ERROR_MESSAGE);
    }

    

    private boolean yaCobrada(Consulta consulta) {
        for (Cobro cobro : gestion.getCobros()) {
            if (cobro.getConsulta() == consulta) {
                return true;
            }
        }
        return false;
    }

    private int numeroConsulta(Consulta consulta) {
        return gestion.getConsultas().indexOf(consulta) + 1;
    }

    private String siguienteIdMascota() {
        int n = gestion.getMascotas().size() + 1;
        String id = String.format("M-%03d", n);
        while (gestion.buscarMascotaPorId(id) != null) {
            id = String.format("M-%03d", ++n);
        }
        return id;
    }

    private String siguienteIdCita() {
        int n = gestion.getCitas().size() + 1;
        String id = String.format("C-%03d", n);
        while (existeIdCita(id)) {
            id = String.format("C-%03d", ++n);
        }
        return id;
    }

    private boolean existeIdCita(String id) {
        for (Cita c : gestion.getCitas()) {
            if (c.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    private String nombrePropietario(Mascota m) {
        return (m != null && m.getPropietario() != null) ? m.getPropietario().getNombre() : "-";
    }

    private String especieDe(Mascota m) {
        if (m instanceof MascotaConvencional c) {
            return c.getTipoConvencional();
        }
        if (m instanceof MascotaExotica x) {
            return x.getTipoExotico();
        }
        return "-";
    }

    private String tipoDe(Mascota m) {
        if (m instanceof MascotaConvencional) {
            return "Convencional";
        }
        if (m instanceof MascotaExotica) {
            return "Exótica";
        }
        return "-";
    }

    private String resumenProductos(List<Vacuna> productos) {
        if (productos == null || productos.isEmpty()) {
            return "Sin productos";
        }
        StringBuilder sb = new StringBuilder();
        for (Vacuna v : productos) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(v.getNombre()).append(" x").append(v.getDosis());
        }
        return sb.toString();
    }

    private String dinero(double valor) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-CO"));
        formato.setMinimumFractionDigits(0);
        formato.setMaximumFractionDigits(2);
        return formato.format(valor);
    }

    
    private String normalizar(String texto) {
        if (texto == null) {
            return "";
        }
        return Normalizer.normalize(texto.trim().toLowerCase(Locale.ROOT), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    private Integer parseEntero(String texto) {
        try {
            return Integer.valueOf(texto.trim());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private Double parseDecimal(String texto) {
        try {
            return Double.valueOf(texto.trim().replace(',', '.'));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private Integer cantidadDe(String texto) {
        Matcher m = ENTERO_INICIAL.matcher(texto);
        if (!m.find()) {
            return null;
        }
        try {
            return Integer.valueOf(m.group(1));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private LocalDate parseFecha(String texto) {
        for (DateTimeFormatter formato : FORMATOS_FECHA) {
            try {
                return LocalDate.parse(texto, formato);
            } catch (DateTimeParseException ex) {
                
            }
        }
        return null;
    }

    private LocalTime parseHora(String texto) {
        try {
            return LocalTime.parse(texto, FORMATO_HORA);
        } catch (DateTimeParseException ex) {
            return null;
        }
    }
}
