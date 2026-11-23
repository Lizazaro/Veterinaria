package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class RegistrarMascota extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);
    private static final Color VERDE_CLARO = new Color(204, 255, 204);
    private static final Color PANEL_INACTIVO = new Color(232, 232, 232);

    public RegistrarMascota() {
        initComponents();
        actualizarPanelesTipo();
        bttonCancelar.addActionListener(e -> dispose());
    }

    private void rbtnConvencionalActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarPanelesTipo();
    }

    private void rbtnExoticaActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarPanelesTipo();
    }

    private void actualizarPanelesTipo() {
        boolean convencional = rbtnConvencional.isSelected();
        pnlDatosConvencional.setBackground(convencional ? VERDE_CLARO : PANEL_INACTIVO);
        pnlDatosExotica.setBackground(convencional ? PANEL_INACTIVO : VERDE_CLARO);
        chkSedacion.setBackground(convencional ? PANEL_INACTIVO : VERDE_CLARO);
        lblRaza.setEnabled(convencional);
        cmbRaza.setEnabled(convencional);
        lblVacunas.setEnabled(convencional);
        spVacunas.setEnabled(convencional);
        txtVacunas.setEnabled(convencional);
        lblPermiso.setEnabled(!convencional);
        txtPermisoICA.setEnabled(!convencional);
        chkSedacion.setEnabled(!convencional);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlContenido = new JPanel();
        grupoTipoMascota = new ButtonGroup();
        lblLogo = new JLabel();
        lblMarca = new JLabel("Huellitas4Life");
        lblTitulo = new JLabel("Registrar mascota");
        separador = new JSeparator();
        lblPropietario = new JLabel("Propietario:");
        cmbPropietario = new JComboBox<>(new String[]{"Seleccione propietario"});
        lblNombreMascota = new JLabel("Nombre de la mascota:");
        txtNombreMascota = new JTextField();
        lblEspecie = new JLabel("Especie / Tipo:");
        cmbEspecie = new JComboBox<>(new String[]{"Seleccione especie", "Perro", "Gato", "Ave", "Reptil", "Otro"});
        lblEdad = new JLabel("Edad:");
        txtEdad = new JTextField();
        cmbUnidadEdad = new JComboBox<>(new String[]{"años", "meses"});
        lblPeso = new JLabel("Peso:");
        txtPeso = new JTextField();
        cmbUnidadPeso = new JComboBox<>(new String[]{"kg", "g"});
        lblTipoMascota = new JLabel("Tipo de mascota:");
        rbtnConvencional = new JRadioButton("Convencional", true);
        rbtnExotica = new JRadioButton("Exótica");
        pnlDatosConvencional = new JPanel();
        lblRaza = new JLabel("Raza:");
        cmbRaza = new JComboBox<>(new String[]{"Seleccione raza", "Labrador Retriever", "Criollo", "Siamés", "Otro"});
        lblVacunas = new JLabel("Vacunas registradas:");
        txtVacunas = new JTextArea();
        spVacunas = new JScrollPane(txtVacunas);
        pnlDatosExotica = new JPanel();
        lblPermiso = new JLabel("Permiso ICA / CITES:");
        txtPermisoICA = new JTextField();
        chkSedacion = new JCheckBox("Requiere sedación");
        bttonGuardarMascota = new JButton("Guardar");
        bttonCancelar = new JButton("Cancelar");

        lblLogo.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/images/huellitas-mini.png")).getImage().getScaledInstance(68, 68, Image.SCALE_SMOOTH)));
        lblLogo.setPreferredSize(new Dimension(68, 68));
        lblMarca.setFont(new Font("Montserrat Black", Font.BOLD, 25));
        lblMarca.setForeground(TEAL);
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        lblPropietario.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblNombreMascota.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblEspecie.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblEdad.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblPeso.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblTipoMascota.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        for (JLabel label : new JLabel[]{lblPropietario, lblNombreMascota, lblEspecie, lblEdad, lblPeso, lblTipoMascota}) label.setForeground(TEAL);
        for (JTextField field : new JTextField[]{txtNombreMascota, txtEdad, txtPeso, txtPermisoICA}) field.setFont(new Font("Montserrat", Font.PLAIN, 14));
        for (JComboBox<?> combo : new JComboBox<?>[]{cmbPropietario, cmbEspecie, cmbUnidadEdad, cmbUnidadPeso, cmbRaza}) combo.setFont(new Font("Montserrat", Font.PLAIN, 13));
        grupoTipoMascota.add(rbtnConvencional);
        grupoTipoMascota.add(rbtnExotica);
        for (JRadioButton radio : new JRadioButton[]{rbtnConvencional, rbtnExotica}) {
            radio.setFont(new Font("Montserrat", Font.PLAIN, 14));
            radio.setForeground(TEAL);
            radio.setBackground(BEIGE);
            radio.setOpaque(false);
        }
        rbtnConvencional.addActionListener(this::rbtnConvencionalActionPerformed);
        rbtnExotica.addActionListener(this::rbtnExoticaActionPerformed);
        pnlDatosConvencional.setBackground(VERDE_CLARO);
        pnlDatosConvencional.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(190, 205, 185)), "Datos de mascota convencional", TitledBorder.LEADING, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 13), TEAL));
        lblRaza.setFont(new Font("Montserrat", Font.PLAIN, 13));
        lblVacunas.setFont(new Font("Montserrat", Font.PLAIN, 13));
        cmbRaza.setFont(new Font("Montserrat", Font.PLAIN, 13));
        txtVacunas.setFont(new Font("Montserrat", Font.PLAIN, 13));
        txtVacunas.setLineWrap(true);
        txtVacunas.setWrapStyleWord(true);
        pnlDatosConvencional.setLayout(new GroupLayout(pnlDatosConvencional));
        GroupLayout convencionalLayout = (GroupLayout) pnlDatosConvencional.getLayout();
        convencionalLayout.setHorizontalGroup(convencionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(convencionalLayout.createSequentialGroup().addGap(10).addGroup(convencionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblRaza).addComponent(lblVacunas, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)).addGap(8).addGroup(convencionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cmbRaza, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE).addComponent(spVacunas, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)).addContainerGap(10, Short.MAX_VALUE)));
        convencionalLayout.setVerticalGroup(convencionalLayout.createSequentialGroup().addGap(8)
            .addGroup(convencionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblRaza).addComponent(cmbRaza, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)).addGap(8)
            .addGroup(convencionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblVacunas).addComponent(spVacunas, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)).addContainerGap(8, Short.MAX_VALUE));
        pnlDatosExotica.setBackground(PANEL_INACTIVO);
        pnlDatosExotica.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)), "Datos de mascota exótica", TitledBorder.LEADING, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 13), TEAL));
        lblPermiso.setFont(new Font("Montserrat", Font.PLAIN, 13));
        chkSedacion.setFont(new Font("Montserrat", Font.PLAIN, 13));
        chkSedacion.setBackground(PANEL_INACTIVO);
        pnlDatosExotica.setLayout(new GroupLayout(pnlDatosExotica));
        GroupLayout exoticaLayout = (GroupLayout) pnlDatosExotica.getLayout();
        exoticaLayout.setHorizontalGroup(exoticaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(exoticaLayout.createSequentialGroup().addGap(10).addGroup(exoticaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(exoticaLayout.createSequentialGroup().addComponent(lblPermiso, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE).addGap(8).addComponent(txtPermisoICA, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)).addComponent(chkSedacion)).addContainerGap(10, Short.MAX_VALUE)));
        exoticaLayout.setVerticalGroup(exoticaLayout.createSequentialGroup().addGap(12)
            .addGroup(exoticaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPermiso).addComponent(txtPermisoICA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)).addGap(14)
            .addComponent(chkSedacion).addContainerGap(10, Short.MAX_VALUE));
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(205, 198, 187)), "Huellitas4Life - Registrar mascota", TitledBorder.CENTER, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        separador.setForeground(ACCENT);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo)).addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(20).addComponent(lblPropietario, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(cmbPropietario, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE).addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(20).addComponent(lblNombreMascota, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtNombreMascota, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE).addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(20).addComponent(lblEspecie, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(cmbEspecie, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE).addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(20).addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE).addGap(8).addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE).addGap(8).addComponent(cmbUnidadEdad, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE).addGap(28).addComponent(lblPeso, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE).addGap(8).addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(8).addComponent(cmbUnidadPeso, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE).addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(20).addComponent(lblTipoMascota, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(rbtnConvencional, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE).addGap(18).addComponent(rbtnExotica, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE).addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(pnlDatosConvencional, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE).addGap(12).addComponent(pnlDatosExotica, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(280).addComponent(bttonGuardarMascota, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE).addGap(18).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPropietario).addComponent(cmbPropietario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblNombreMascota).addComponent(txtNombreMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEspecie).addComponent(cmbEspecie, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEdad).addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(cmbUnidadEdad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblPeso).addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(cmbUnidadPeso, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblTipoMascota).addComponent(rbtnConvencional).addComponent(rbtnExotica)).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(pnlDatosConvencional, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE).addComponent(pnlDatosExotica, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)).addGap(14)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(bttonGuardarMascota, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addContainerGap(12, Short.MAX_VALUE));
        GroupLayout rootLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(rootLayout);
        rootLayout.setHorizontalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(rootLayout.createSequentialGroup().addGap(10).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(10)));
        rootLayout.setVerticalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(rootLayout.createSequentialGroup().addGap(8).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(8)));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Registrar mascota");
        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel pnlContenido;
    private ButtonGroup grupoTipoMascota;
    private JLabel lblLogo, lblMarca, lblTitulo, lblPropietario, lblNombreMascota, lblEspecie, lblEdad, lblPeso, lblTipoMascota, lblRaza, lblVacunas, lblPermiso;
    private JSeparator separador;
    private JComboBox<String> cmbPropietario, cmbEspecie, cmbUnidadEdad, cmbUnidadPeso, cmbRaza;
    private JTextField txtNombreMascota, txtEdad, txtPeso, txtPermisoICA;
    private JRadioButton rbtnConvencional, rbtnExotica;
    private JPanel pnlDatosConvencional, pnlDatosExotica;
    private JTextArea txtVacunas;
    private JScrollPane spVacunas;
    private JCheckBox chkSedacion;
    private JButton bttonGuardarMascota, bttonCancelar;
    // End of variables declaration//GEN-END:variables
}
