package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
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
    public void setControlador(ActionListener controlador){
    bttonAgregarProducto.setActionCommand("agregarProducto");
    bttonAgregarProducto.addActionListener(controlador);
    bttonGuardarConsulta.setActionCommand("guardarConsulta");
    bttonGuardarConsulta.addActionListener(controlador);
    
    
    }

    public JTextField getTxtMascotaSeleccionada() {
        return txtMascotaSeleccionada;
    }

    public JTextField getTxtPropietario() {
        return txtPropietario;
    }

    public JTextField getTxtEspecieTipo() {
        return txtEspecieTipo;
    }

    public JTextField getTxtEdadMascota() {
        return txtEdadMascota;
    }

    public JTextField getTxtPesoMascota() {
        return txtPesoMascota;
    }

    public JTextArea getTxtDiagnostico() {
        return txtDiagnostico;
    }

    public JTextArea getTxtNotas() {
        return txtNotas;
    }

    public JTextField getTxtProducto() {
        return txtProducto;
    }

    public JTextField getTxtDosis() {
        return txtDosis;
    }

    

    public JComboBox getCmbTipoProducto() {
        return cmbTipoProducto;
    }

    public JTable getTblProductos() {
        return tblProductos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lblMascotaInfo = new javax.swing.JLabel();
        lblMascota = new javax.swing.JLabel();
        txtMascotaSeleccionada = new javax.swing.JTextField();
        lblPropietario = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        lblEspecieTipo = new javax.swing.JLabel();
        txtEspecieTipo = new javax.swing.JTextField();
        lblEdadMascota = new javax.swing.JLabel();
        txtEdadMascota = new javax.swing.JTextField();
        lblPesoMascota = new javax.swing.JLabel();
        txtPesoMascota = new javax.swing.JTextField();
        lblDiagnostico = new javax.swing.JLabel();
        spDiagnostico = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        lblNotas = new javax.swing.JLabel();
        spNotas = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        lblProductos = new javax.swing.JLabel();
        lblTipoProducto = new javax.swing.JLabel();
        cmbTipoProducto = new javax.swing.JComboBox();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        lblDosis = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        bttonAgregarProducto = new javax.swing.JButton();
        spProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        bttonGuardarConsulta = new javax.swing.JButton();
        bttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Atender consulta");
        setBackground(new java.awt.Color(250, 246, 237));

        pnlContenido.setBackground(new java.awt.Color(250, 246, 237));
        pnlContenido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huellitas4Life - Atender consulta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Montserrat Black", 1, 15), new java.awt.Color(0, 102, 102))); 

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellitas-mini.png"))); 

        lblMarca.setText("Huellitas4Life");
        lblMarca.setFont(new java.awt.Font("Montserrat Black", 1, 25)); 
        lblMarca.setForeground(new java.awt.Color(0, 102, 102));

        lblTitulo.setText("Atender consulta");
        lblTitulo.setFont(new java.awt.Font("Montserrat Black", 1, 21)); 
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));

        separador.setForeground(new java.awt.Color(0, 153, 153));

        lblMascotaInfo.setText("Datos de la mascota seleccionada");
        lblMascotaInfo.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblMascotaInfo.setForeground(new java.awt.Color(0, 102, 102));

        lblMascota.setText("Mascota");
        lblMascota.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblMascota.setForeground(new java.awt.Color(0, 102, 102));

        txtMascotaSeleccionada.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtMascotaSeleccionada.setColumns(20);
        txtMascotaSeleccionada.setEditable(false);
        txtMascotaSeleccionada.setBackground(new java.awt.Color(240, 237, 229));

        lblPropietario.setText("Propietario");
        lblPropietario.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblPropietario.setForeground(new java.awt.Color(0, 102, 102));

        txtPropietario.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtPropietario.setColumns(20);
        txtPropietario.setEditable(false);
        txtPropietario.setBackground(new java.awt.Color(240, 237, 229));

        lblEspecieTipo.setText("Especie / tipo");
        lblEspecieTipo.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblEspecieTipo.setForeground(new java.awt.Color(0, 102, 102));

        txtEspecieTipo.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtEspecieTipo.setColumns(20);
        txtEspecieTipo.setEditable(false);
        txtEspecieTipo.setBackground(new java.awt.Color(240, 237, 229));

        lblEdadMascota.setText("Edad");
        lblEdadMascota.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblEdadMascota.setForeground(new java.awt.Color(0, 102, 102));

        txtEdadMascota.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtEdadMascota.setColumns(20);
        txtEdadMascota.setEditable(false);
        txtEdadMascota.setBackground(new java.awt.Color(240, 237, 229));

        lblPesoMascota.setText("Peso");
        lblPesoMascota.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblPesoMascota.setForeground(new java.awt.Color(0, 102, 102));

        txtPesoMascota.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtPesoMascota.setColumns(20);
        txtPesoMascota.setEditable(false);
        txtPesoMascota.setBackground(new java.awt.Color(240, 237, 229));

        lblDiagnostico.setText("Diagnóstico");
        lblDiagnostico.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblDiagnostico.setForeground(new java.awt.Color(0, 102, 102));

        txtDiagnostico.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setWrapStyleWord(true);
        spDiagnostico.setViewportView(txtDiagnostico);

        lblNotas.setText("Notas médicas");
        lblNotas.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblNotas.setForeground(new java.awt.Color(0, 102, 102));

        txtNotas.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtNotas.setLineWrap(true);
        txtNotas.setWrapStyleWord(true);
        spNotas.setViewportView(txtNotas);

        lblProductos.setText("Vacunas, medicamentos y procedimientos por aplicar");
        lblProductos.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblProductos.setForeground(new java.awt.Color(0, 102, 102));

        lblTipoProducto.setText("Tipo");
        lblTipoProducto.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblTipoProducto.setForeground(new java.awt.Color(0, 102, 102));

        cmbTipoProducto.setFont(new java.awt.Font("Montserrat", 0, 13)); 

        lblProducto.setText("Producto");
        lblProducto.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblProducto.setForeground(new java.awt.Color(0, 102, 102));

        txtProducto.setFont(new java.awt.Font("Montserrat", 0, 14)); 
        txtProducto.setColumns(20);

        lblDosis.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblDosis.setForeground(new java.awt.Color(0, 102, 102));
        lblDosis.setText("Dosis ");

        txtDosis.setColumns(20);
        txtDosis.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        bttonAgregarProducto.setBackground(new java.awt.Color(0, 153, 153));
        bttonAgregarProducto.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        bttonAgregarProducto.setText("Agregar");
        bttonAgregarProducto.setFocusPainted(false);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Producto", "Dosis / detalle", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setFont(new java.awt.Font("Montserrat", 0, 12)); 
        spProductos.setViewportView(tblProductos);

        bttonGuardarConsulta.setText("Guardar consulta");
        bttonGuardarConsulta.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonGuardarConsulta.setFocusPainted(false);
        bttonGuardarConsulta.setBackground(new java.awt.Color(0, 153, 153));
        bttonGuardarConsulta.setForeground(new java.awt.Color(255, 255, 255));

        bttonCancelar.setText("Cancelar");
        bttonCancelar.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonCancelar.setFocusPainted(false);
        bttonCancelar.setBackground(new java.awt.Color(0, 153, 153));
        bttonCancelar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenidoLayout.createSequentialGroup()
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 880, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(pnlContenidoLayout.createSequentialGroup()
                        .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarca)
                                    .addComponent(lblTitulo)))
                            .addComponent(lblMascotaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtMascotaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblEspecieTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtEspecieTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bttonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(bttonGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContenidoLayout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addGap(0, 0, 0)
                        .addComponent(lblTitulo)))
                .addGap(6, 6, 6)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblMascotaInfo)
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMascota)
                    .addComponent(txtMascotaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPropietario)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecieTipo)
                    .addComponent(txtEspecieTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdadMascota)
                    .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesoMascota)
                    .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblDiagnostico)
                .addGap(6, 6, 6)
                .addComponent(spDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblNotas)
                .addGap(6, 6, 6)
                .addComponent(spNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblProductos)
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoProducto)
                    .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDosis)
                    .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttonAgregarProducto))
                .addGap(6, 6, 6)
                .addComponent(spProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttonGuardarConsulta)
                    .addComponent(bttonCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonAgregarProducto;
    private javax.swing.JButton bttonCancelar;
    private javax.swing.JButton bttonGuardarConsulta;
    private javax.swing.JComboBox cmbTipoProducto;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblDosis;
    private javax.swing.JLabel lblEdadMascota;
    private javax.swing.JLabel lblEspecieTipo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMascota;
    private javax.swing.JLabel lblMascotaInfo;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblPesoMascota;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblTipoProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JSeparator separador;
    private javax.swing.JScrollPane spDiagnostico;
    private javax.swing.JScrollPane spNotas;
    private javax.swing.JScrollPane spProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtEdadMascota;
    private javax.swing.JTextField txtEspecieTipo;
    private javax.swing.JTextField txtMascotaSeleccionada;
    private javax.swing.JTextArea txtNotas;
    private javax.swing.JTextField txtPesoMascota;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtPropietario;
    // End of variables declaration//GEN-END:variables
}
