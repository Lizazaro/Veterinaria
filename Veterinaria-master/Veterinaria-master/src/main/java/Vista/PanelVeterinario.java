



package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;





public class PanelVeterinario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelVeterinario.class.getName());

    


    
    
    public PanelVeterinario() {
        initComponents();
        bttonInicio.setText("Inicio");
        bttonAgenda.setText("Agenda");
        bttonConsulta.setText("Consulta");
        bttonHistorial.setText("Historial Clínico");
        bttonAtendConsul.setText("Atender Consulta");
        bttonVerHist.setText("Ver Historial");
        pack();
        setLocationRelativeTo(null);
        
    }
    

    public void setControlador(java.awt.event.ActionListener controlador) {
        asignar(bttonInicio, "inicio", controlador);
        asignar(bttonAgenda, "abrirAgenda", controlador);
        asignar(bttonConsulta, "abrirConsultas", controlador);
        asignar(bttonHistorial, "abrirHistorial", controlador);
        asignar(bttonAtendConsul, "atenderConsulta", controlador);
        asignar(bttonVerHist, "verHistorial", controlador);
    }

    private static void asignar(javax.swing.JButton boton, String comando, java.awt.event.ActionListener controlador) {
        boton.setActionCommand(comando);
        boton.addActionListener(controlador);
    }

    public JLabel getLblConsultHoy() {
        return lblConsultHoy;
    }

    public JLabel getLblMascotasHoyContador() {
        return lblMascotasHoyContador;
    }

    public javax.swing.JTable getTableVeterinario() {
        return tableVeterinario;
    }

    




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bttonAgenda = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        bttonConsulta = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        bttonHistorial = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        bttonInicio = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblConsultHoy = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblMascotasHoyContador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVeterinario = new javax.swing.JTable();
        bttonAtendConsul = new javax.swing.JButton();
        bttonVerHist = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 246, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huellitas4Life - Veterinario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Montserrat Black", 1, 18), new java.awt.Color(0, 153, 153))); 
        jPanel1.setForeground(new java.awt.Color(250, 246, 237));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Huellitas4Life");

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellablanca.png"))); 

        bttonAgenda.setBackground(new java.awt.Color(0, 102, 102));
        bttonAgenda.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        bttonAgenda.setText("Agenda");
        bttonAgenda.setBorder(null);
        bttonAgenda.setBorderPainted(false);
        bttonAgenda.setContentAreaFilled(false);
        bttonAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonAgendaActionPerformed(evt);
            }
        });

        bttonConsulta.setBackground(new java.awt.Color(0, 102, 102));
        bttonConsulta.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonConsulta.setForeground(new java.awt.Color(255, 255, 255));
        bttonConsulta.setText("Consulta");
        bttonConsulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bttonConsulta.setContentAreaFilled(false);
        bttonConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonConsultaActionPerformed(evt);
            }
        });

        bttonHistorial.setBackground(new java.awt.Color(0, 102, 102));
        bttonHistorial.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonHistorial.setForeground(new java.awt.Color(255, 255, 255));
        bttonHistorial.setText("Historial Clínico");
        bttonHistorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bttonHistorial.setContentAreaFilled(false);
        bttonHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonHistorialActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        bttonInicio.setBackground(new java.awt.Color(204, 255, 204));
        bttonInicio.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonInicio.setForeground(new java.awt.Color(0, 102, 102));
        bttonInicio.setText("Inicio");
        bttonInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bttonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(bttonInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttonInicio)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttonConsulta)
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(bttonAgenda))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(bttonHistorial)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Próximas Consultas");

        lblConsultHoy.setBackground(new java.awt.Color(204, 255, 204));
        lblConsultHoy.setFont(new java.awt.Font("Montserrat Black", 1, 48)); 
        lblConsultHoy.setForeground(new java.awt.Color(0, 102, 102));
        lblConsultHoy.setText("000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblConsultHoy)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultHoy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mascotas para hoy");

        lblMascotasHoyContador.setBackground(new java.awt.Color(204, 255, 204));
        lblMascotasHoyContador.setFont(new java.awt.Font("Montserrat Black", 1, 48)); 
        lblMascotasHoyContador.setForeground(new java.awt.Color(255, 255, 255));
        lblMascotasHoyContador.setText("000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblMascotasHoyContador)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMascotasHoyContador)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Cola de Atención--------------------------------------------");

        tableVeterinario.setBackground(new java.awt.Color(250, 246, 237));
        tableVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Orden", "Hora", "Mascota", "Propietario", "Estado"
            }
        ));
        tableVeterinario.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tableVeterinario);

        bttonAtendConsul.setBackground(new java.awt.Color(0, 153, 153));
        bttonAtendConsul.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonAtendConsul.setForeground(new java.awt.Color(255, 255, 255));
        bttonAtendConsul.setText("Atender Consulta");
        bttonAtendConsul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonAtendConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonAtendConsulActionPerformed(evt);
            }
        });

        bttonVerHist.setBackground(new java.awt.Color(0, 153, 153));
        bttonVerHist.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonVerHist.setForeground(new java.awt.Color(255, 255, 255));
        bttonVerHist.setText("Ver Historial");
        bttonVerHist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttonVerHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonVerHistActionPerformed(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellitas.png"))); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblIcon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttonAtendConsul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttonVerHist)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblIcon)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttonAtendConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttonVerHist, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonInicioActionPerformed
        
    }//GEN-LAST:event_bttonInicioActionPerformed

    private void bttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }                                           

    private void bttonConsultaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                             

    private void bttonHistorialActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                              

private void bttonAtendConsulActionPerformed(java.awt.event.ActionEvent evt) {
        
    }                                                

    private void bttonVerHistActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                            

    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonAgenda;
    private javax.swing.JButton bttonAtendConsul;
    private javax.swing.JButton bttonConsulta;
    private javax.swing.JButton bttonHistorial;
    private javax.swing.JButton bttonInicio;
    private javax.swing.JButton bttonVerHist;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblConsultHoy;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblMascotasHoyContador;
    private javax.swing.JTable tableVeterinario;
    // End of variables declaration//GEN-END:variables
}
