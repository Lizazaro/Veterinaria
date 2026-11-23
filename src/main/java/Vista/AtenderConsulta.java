package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

public class AtenderConsulta extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);

    public AtenderConsulta() {
        initComponents();
        bttonCancelar.addActionListener(e -> dispose());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlContenido = new JPanel();
        lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/images/huellitas-mini.png")).getImage().getScaledInstance(68, 68, Image.SCALE_SMOOTH)));
        lblLogo.setPreferredSize(new Dimension(68, 68));
        lblMarca = new JLabel();
        lblMarca.setText("Huellitas4Life");
        lblMarca.setFont(new Font("Montserrat Black", Font.BOLD, 25));
        lblMarca.setForeground(TEAL);
        lblTitulo = new JLabel();
        lblTitulo.setText("Atender consulta");
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        separador = new JSeparator();
        lblMascotaInfo = new JLabel();
        lblMascotaInfo.setText("Datos de la mascota seleccionada");
        lblMascotaInfo.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblMascotaInfo.setForeground(TEAL);
        lblMascota = new JLabel();
        lblMascota.setText("Mascota");
        lblMascota.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblMascota.setForeground(TEAL);
        txtMascotaSeleccionada = new JTextField();
        txtMascotaSeleccionada.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtMascotaSeleccionada.setColumns(20);
        txtMascotaSeleccionada.setEditable(false);
        txtMascotaSeleccionada.setBackground(new Color(240, 237, 229));
        lblPropietario = new JLabel();
        lblPropietario.setText("Propietario");
        lblPropietario.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblPropietario.setForeground(TEAL);
        txtPropietario = new JTextField();
        txtPropietario.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtPropietario.setColumns(20);
        txtPropietario.setEditable(false);
        txtPropietario.setBackground(new Color(240, 237, 229));
        lblEspecieTipo = new JLabel();
        lblEspecieTipo.setText("Especie / tipo");
        lblEspecieTipo.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblEspecieTipo.setForeground(TEAL);
        txtEspecieTipo = new JTextField();
        txtEspecieTipo.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtEspecieTipo.setColumns(20);
        txtEspecieTipo.setEditable(false);
        txtEspecieTipo.setBackground(new Color(240, 237, 229));
        lblEdadMascota = new JLabel();
        lblEdadMascota.setText("Edad");
        lblEdadMascota.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblEdadMascota.setForeground(TEAL);
        txtEdadMascota = new JTextField();
        txtEdadMascota.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtEdadMascota.setColumns(20);
        txtEdadMascota.setEditable(false);
        txtEdadMascota.setBackground(new Color(240, 237, 229));
        lblPesoMascota = new JLabel();
        lblPesoMascota.setText("Peso");
        lblPesoMascota.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblPesoMascota.setForeground(TEAL);
        txtPesoMascota = new JTextField();
        txtPesoMascota.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtPesoMascota.setColumns(20);
        txtPesoMascota.setEditable(false);
        txtPesoMascota.setBackground(new Color(240, 237, 229));
        lblDiagnostico = new JLabel();
        lblDiagnostico.setText("Diagnóstico");
        lblDiagnostico.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblDiagnostico.setForeground(TEAL);
        txtDiagnostico = new JTextArea();
        txtDiagnostico.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setWrapStyleWord(true);
        spDiagnostico = new JScrollPane();
        spDiagnostico.setViewportView(txtDiagnostico);
        lblNotas = new JLabel();
        lblNotas.setText("Notas médicas");
        lblNotas.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblNotas.setForeground(TEAL);
        txtNotas = new JTextArea();
        txtNotas.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtNotas.setLineWrap(true);
        txtNotas.setWrapStyleWord(true);
        spNotas = new JScrollPane();
        spNotas.setViewportView(txtNotas);
        lblProductos = new JLabel();
        lblProductos.setText("Vacunas, medicamentos y procedimientos por aplicar");
        lblProductos.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblProductos.setForeground(TEAL);
        lblTipoProducto = new JLabel();
        lblTipoProducto.setText("Tipo");
        lblTipoProducto.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblTipoProducto.setForeground(TEAL);
        cmbTipoProducto = new JComboBox();
        cmbTipoProducto.setModel(new DefaultComboBoxModel<>(new String[] {"Vacuna", "Medicamento", "Procedimiento", "Sedación"}));
        cmbTipoProducto.setFont(new Font("Montserrat", Font.PLAIN, 13));
        lblProducto = new JLabel();
        lblProducto.setText("Producto");
        lblProducto.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblProducto.setForeground(TEAL);
        txtProducto = new JTextField();
        txtProducto.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtProducto.setColumns(20);
        lblDosis = new JLabel();
        lblDosis.setText("Dosis / detalle");
        lblDosis.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblDosis.setForeground(TEAL);
        txtDosis = new JTextField();
        txtDosis.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtDosis.setColumns(20);
        lblCantidad = new JLabel();
        lblCantidad.setText("Cant.");
        lblCantidad.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCantidad.setForeground(TEAL);
        txtCantidad = new JTextField();
        txtCantidad.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtCantidad.setColumns(20);
        bttonAgregarProducto = new JButton();
        bttonAgregarProducto.setText("Agregar");
        bttonAgregarProducto.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonAgregarProducto.setBackground(ACCENT);
        bttonAgregarProducto.setForeground(Color.WHITE);
        bttonAgregarProducto.setFocusPainted(false);
        tblProductos = new JTable();
        tblProductos.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Tipo", "Producto", "Dosis / detalle", "Cantidad"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblProductos.setRowHeight(27);
        tblProductos.setFont(new Font("Montserrat", Font.PLAIN, 12));
        tblProductos.getTableHeader().setFont(new Font("Montserrat Black", Font.BOLD, 12));
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.setSelectionBackground(new Color(204, 255, 204));
        tblProductos.setSelectionForeground(TEAL);
        spProductos = new JScrollPane();
        spProductos.setViewportView(tblProductos);
        bttonGuardarConsulta = new JButton();
        bttonGuardarConsulta.setText("Guardar consulta");
        bttonGuardarConsulta.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonGuardarConsulta.setBackground(ACCENT);
        bttonGuardarConsulta.setForeground(Color.WHITE);
        bttonGuardarConsulta.setFocusPainted(false);
        bttonCancelar = new JButton();
        bttonCancelar.setText("Cancelar");
        bttonCancelar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonCancelar.setBackground(ACCENT);
        bttonCancelar.setForeground(Color.WHITE);
        bttonCancelar.setFocusPainted(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Atender consulta");
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(205, 198, 187)), "Huellitas4Life - Atender consulta", TitledBorder.CENTER, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        separador.setForeground(ACCENT);
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo)).addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblMascotaInfo, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblMascota, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtMascotaSeleccionada, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblPropietario, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblEspecieTipo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtEspecieTipo, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblEdadMascota, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtEdadMascota, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblPesoMascota, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtPesoMascota, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblDiagnostico, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spDiagnostico, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblNotas, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spNotas, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblProductos, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblTipoProducto, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(cmbTipoProducto, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtProducto, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblDosis, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtDosis, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(bttonAgregarProducto, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spProductos, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(bttonGuardarConsulta, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addComponent(lblMascotaInfo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtMascotaSeleccionada, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblPropietario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEspecieTipo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtEspecieTipo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblEdadMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtEdadMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblPesoMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtPesoMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(lblDiagnostico, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spDiagnostico, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(lblNotas, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spNotas, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(lblProductos, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblTipoProducto, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(cmbTipoProducto, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtProducto, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblDosis, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtDosis, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(bttonAgregarProducto, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spProductos, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(bttonGuardarConsulta, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addContainerGap(12, Short.MAX_VALUE));
        GroupLayout rootLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(rootLayout);
        rootLayout.setHorizontalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(rootLayout.createSequentialGroup().addGap(10).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(10)));
        rootLayout.setVerticalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(rootLayout.createSequentialGroup().addGap(8).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(8)));
        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel pnlContenido;
    private JLabel lblLogo;
    private JLabel lblMarca;
    private JLabel lblTitulo;
    private JSeparator separador;
    private JLabel lblMascotaInfo;
    private JLabel lblMascota;
    private JTextField txtMascotaSeleccionada;
    private JLabel lblPropietario;
    private JTextField txtPropietario;
    private JLabel lblEspecieTipo;
    private JTextField txtEspecieTipo;
    private JLabel lblEdadMascota;
    private JTextField txtEdadMascota;
    private JLabel lblPesoMascota;
    private JTextField txtPesoMascota;
    private JLabel lblDiagnostico;
    private JTextArea txtDiagnostico;
    private JScrollPane spDiagnostico;
    private JLabel lblNotas;
    private JTextArea txtNotas;
    private JScrollPane spNotas;
    private JLabel lblProductos;
    private JLabel lblTipoProducto;
    private JComboBox cmbTipoProducto;
    private JLabel lblProducto;
    private JTextField txtProducto;
    private JLabel lblDosis;
    private JTextField txtDosis;
    private JLabel lblCantidad;
    private JTextField txtCantidad;
    private JButton bttonAgregarProducto;
    private JTable tblProductos;
    private JScrollPane spProductos;
    private JButton bttonGuardarConsulta;
    private JButton bttonCancelar;
    // End of variables declaration//GEN-END:variables
}
