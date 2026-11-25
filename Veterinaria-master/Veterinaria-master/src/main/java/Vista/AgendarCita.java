package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

public class AgendarCita extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);

    public AgendarCita() {
        initComponents();
        bttonCancelar.addActionListener(e -> dispose());
    }
    public void setControlador(ActionListener controlador){
    bttonGuardarCita.setActionCommand("guardarCita");
    bttonGuardarCita.addActionListener(controlador);
    
    }

    public JComboBox<String> getCmbPropietario() {
        return cmbPropietario;
    }

    public JComboBox<String> getCmbMascota() {
        return cmbMascota;
    }

    public JComboBox<String> getCmbVeterinario() {
        return cmbVeterinario;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public JTextField getTxtMotivo() {
        return txtMotivo;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lblCampo1 = new javax.swing.JLabel();
        cmbPropietario = new javax.swing.JComboBox<>();
        lblCampo2 = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        lblCampo3 = new javax.swing.JLabel();
        cmbVeterinario = new javax.swing.JComboBox<>();
        lblCampo4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblCampo5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblCampo6 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        bttonGuardarCita = new javax.swing.JButton();
        bttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Agendar cita");
        setBackground(new java.awt.Color(250, 246, 237));

        pnlContenido.setBackground(new java.awt.Color(250, 246, 237));
        pnlContenido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huellitas4Life - Agendar cita", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Montserrat Black", 1, 15), new java.awt.Color(0, 102, 102))); 

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellitas-mini.png"))); 

        lblMarca.setText("Huellitas4Life");
        lblMarca.setFont(new java.awt.Font("Montserrat Black", 1, 25)); 
        lblMarca.setForeground(new java.awt.Color(0, 102, 102));

        lblTitulo.setText("Agendar cita");
        lblTitulo.setFont(new java.awt.Font("Montserrat Black", 1, 21)); 
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));

        separador.setForeground(new java.awt.Color(0, 153, 153));

        lblCampo1.setText("Propietario");
        lblCampo1.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo1.setForeground(new java.awt.Color(0, 102, 102));

        cmbPropietario.setEditable(true);
        cmbPropietario.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblCampo2.setText("Mascota");
        lblCampo2.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo2.setForeground(new java.awt.Color(0, 102, 102));

        cmbMascota.setEditable(true);
        cmbMascota.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblCampo3.setText("Médico veterinario");
        lblCampo3.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo3.setForeground(new java.awt.Color(0, 102, 102));

        cmbVeterinario.setEditable(true);
        cmbVeterinario.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblCampo4.setText("Fecha");
        lblCampo4.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo4.setForeground(new java.awt.Color(0, 102, 102));

        txtFecha.setColumns(20);
        txtFecha.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblCampo5.setText("Hora");
        lblCampo5.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo5.setForeground(new java.awt.Color(0, 102, 102));

        txtHora.setColumns(20);
        txtHora.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblCampo6.setText("Motivo de la cita");
        lblCampo6.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblCampo6.setForeground(new java.awt.Color(0, 102, 102));

        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        bttonGuardarCita.setBackground(new java.awt.Color(0, 153, 153));
        bttonGuardarCita.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonGuardarCita.setForeground(new java.awt.Color(255, 255, 255));
        bttonGuardarCita.setText("Agendar cita");
        bttonGuardarCita.setFocusPainted(false);

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
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(bttonGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo1)
                    .addComponent(cmbPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo2)
                    .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo3)
                    .addComponent(cmbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo5)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo6)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttonGuardarCita)
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
    private javax.swing.JButton bttonCancelar;
    private javax.swing.JButton bttonGuardarCita;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbPropietario;
    private javax.swing.JComboBox<String> cmbVeterinario;
    private javax.swing.JLabel lblCampo1;
    private javax.swing.JLabel lblCampo2;
    private javax.swing.JLabel lblCampo3;
    private javax.swing.JLabel lblCampo4;
    private javax.swing.JLabel lblCampo5;
    private javax.swing.JLabel lblCampo6;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
