package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

public class Cobros extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);

    public Cobros() {
        initComponents();
        bttonCancelar.addActionListener(e -> dispose());
    }
    public void setControlador(ActionListener controlador){
    bttonGenerarCobro.addActionListener(controlador);
    bttonGenerarCobro.setActionCommand("generarCobro");
    }

    public JTable getTblPendientes() {
        return tblPendientes;
    }

    public JTable getTblDetalleCobro() {
        return tblDetalleCobro;
    }

    public JCheckBox getChkDescuento() {
        return chkDescuento;
    }

    public JScrollPane getSpDetalle() {
        return spDetalle;
    }

    public JScrollPane getSpPendientes() {
        return spPendientes;
    }

    public JTextField getTxtRecargo() {
        return txtRecargo;
    }

    public JTextField getTxtTarifaBase() {
        return txtTarifaBase;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lblPendientes = new javax.swing.JLabel();
        spPendientes = new javax.swing.JScrollPane();
        tblPendientes = new javax.swing.JTable();
        lblDetalle = new javax.swing.JLabel();
        spDetalle = new javax.swing.JScrollPane();
        tblDetalleCobro = new javax.swing.JTable();
        lblTarifa = new javax.swing.JLabel();
        txtTarifaBase = new javax.swing.JTextField();
        lblRecargo = new javax.swing.JLabel();
        txtRecargo = new javax.swing.JTextField();
        chkDescuento = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        bttonGenerarCobro = new javax.swing.JButton();
        bttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Cobros y comprobantes");
        setBackground(new java.awt.Color(250, 246, 237));

        pnlContenido.setBackground(new java.awt.Color(250, 246, 237));
        pnlContenido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huellitas4Life - Cobros y comprobantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Montserrat Black", 1, 15), new java.awt.Color(0, 102, 102))); 

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellitas-mini.png"))); 

        lblMarca.setFont(new java.awt.Font("Montserrat Black", 1, 25)); 
        lblMarca.setForeground(new java.awt.Color(0, 102, 102));
        lblMarca.setText("Huellitas4Life");

        lblTitulo.setFont(new java.awt.Font("Montserrat Black", 1, 21)); 
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblTitulo.setText("Cobros y comprobantes");

        separador.setForeground(new java.awt.Color(0, 153, 153));

        lblPendientes.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblPendientes.setForeground(new java.awt.Color(0, 102, 102));
        lblPendientes.setText("Consultas pendientes de cobro");

        tblPendientes.setFont(new java.awt.Font("Montserrat", 0, 12)); 
        tblPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Fecha", "Mascota", "Propietario", "Productos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spPendientes.setViewportView(tblPendientes);

        lblDetalle.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblDetalle.setForeground(new java.awt.Color(0, 102, 102));
        lblDetalle.setText("Vacunas, medicamentos y procedimientos de la consulta seleccionada");

        tblDetalleCobro.setFont(new java.awt.Font("Montserrat", 0, 12)); 
        tblDetalleCobro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Producto", "Dosis / detalle", "Cantidad", "Precio unitario", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spDetalle.setViewportView(tblDetalleCobro);

        lblTarifa.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblTarifa.setForeground(new java.awt.Color(0, 102, 102));
        lblTarifa.setText("Tarifa base de consulta");

        txtTarifaBase.setColumns(20);
        txtTarifaBase.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        lblRecargo.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblRecargo.setForeground(new java.awt.Color(0, 102, 102));
        lblRecargo.setText("Recargo exótico (25%)");

        txtRecargo.setColumns(20);
        txtRecargo.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        chkDescuento.setBackground(new java.awt.Color(250, 246, 237));
        chkDescuento.setFont(new java.awt.Font("Montserrat", 1, 13)); 
        chkDescuento.setForeground(new java.awt.Color(0, 102, 102));
        chkDescuento.setText("Aplicar 10% (propietario con más de 2 mascotas)");

        lblTotal.setFont(new java.awt.Font("Montserrat Black", 1, 14)); 
        lblTotal.setForeground(new java.awt.Color(0, 102, 102));
        lblTotal.setText("TOTAL A PAGAR");

        txtTotal.setColumns(20);
        txtTotal.setFont(new java.awt.Font("Montserrat", 0, 14)); 

        bttonGenerarCobro.setBackground(new java.awt.Color(0, 153, 153));
        bttonGenerarCobro.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonGenerarCobro.setForeground(new java.awt.Color(255, 255, 255));
        bttonGenerarCobro.setText("Registrar cobro");
        bttonGenerarCobro.setFocusPainted(false);
        bttonGenerarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonGenerarCobroActionPerformed(evt);
            }
        });

        bttonCancelar.setBackground(new java.awt.Color(0, 153, 153));
        bttonCancelar.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); 
        bttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bttonCancelar.setText("Cerrar");
        bttonCancelar.setFocusPainted(false);

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
                            .addComponent(lblPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(lblTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtTarifaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(bttonGenerarCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chkDescuento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenidoLayout.createSequentialGroup()
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(lblPendientes)
                .addGap(6, 6, 6)
                .addComponent(spPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblDetalle)
                .addGap(6, 6, 6)
                .addComponent(spDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarifa)
                    .addComponent(txtTarifaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecargo)
                    .addComponent(txtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(chkDescuento)
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttonGenerarCobro)
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

    private void bttonGenerarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonGenerarCobroActionPerformed
        
    }//GEN-LAST:event_bttonGenerarCobroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonCancelar;
    private javax.swing.JButton bttonGenerarCobro;
    private javax.swing.JCheckBox chkDescuento;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPendientes;
    private javax.swing.JLabel lblRecargo;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JSeparator separador;
    private javax.swing.JScrollPane spDetalle;
    private javax.swing.JScrollPane spPendientes;
    private javax.swing.JTable tblDetalleCobro;
    private javax.swing.JTable tblPendientes;
    private javax.swing.JTextField txtRecargo;
    private javax.swing.JTextField txtTarifaBase;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
