



package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;





public class PanelRecepcionista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelRecepcionista.class.getName());

    


    
    
    public PanelRecepcionista() {
        initComponents();
        bttonInicio.setText("Inicio");
        bttonPropie.setText("Propietarios");
        bttonMascotas.setText("Mascotas");
        bttonCitas.setText("Citas");
        bttonCitas1.setText("Cobros");
        bttonRegProp.setText("Registrar Propietario");
        bttonRegMasc.setText("Registrar Mascota");
        bttonAgenCita.setText("Agendar Cita");
        bttonRegMasc1.setText("Registrar Cobro");
        tableRecepcionista.setFillsViewportHeight(true);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(250, 246, 237));
        pack();
        setLocationRelativeTo(null);
        
    }

    public void setControlador(java.awt.event.ActionListener controlador) {
        asignar(bttonInicio, "inicio", controlador);
        asignar(bttonPropie, "abrirPropietarios", controlador);
        asignar(bttonMascotas, "abrirMascotas", controlador);
        asignar(bttonCitas, "abrirCitas", controlador);
        asignar(bttonCitas1, "abrirCobros", controlador);
        asignar(bttonRegProp, "nuevoPropietario", controlador);
        asignar(bttonRegMasc, "nuevaMascota", controlador);
        asignar(bttonAgenCita, "nuevaCita", controlador);
        asignar(bttonRegMasc1, "nuevoCobro", controlador);
    }

    private static void asignar(javax.swing.JButton boton, String comando, java.awt.event.ActionListener controlador) {
        boton.setActionCommand(comando);
        boton.addActionListener(controlador);
    }

    public JLabel getLblCitHoy() {
        return lblCitHoy;
    }

    public JLabel getLblMascotasContador() {
        return lblMascotasContador;
    }

    public JTable getTablePrincipal() {
        return tableRecepcionista;
    }
    

    




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bttonPropie = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        bttonMascotas = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        bttonCitas = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        bttonCitas1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bttonInicio = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCitHoy = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblMascotasContador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecepcionista = new javax.swing.JTable();
        bttonRegProp = new javax.swing.JButton();
        bttonRegMasc = new javax.swing.JButton();
        bttonAgenCita = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        bttonRegMasc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 246, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huellitas4Life - Recepcionista", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Montserrat Black", 1, 18), new java.awt.Color(0, 153, 153))); 
        jPanel1.setForeground(new java.awt.Color(250, 246, 237));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Huellitas4Life");

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellablanca.png"))); 

        bttonPropie.setBackground(new java.awt.Color(0, 102, 102));
        bttonPropie.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonPropie.setForeground(new java.awt.Color(255, 255, 255));
        bttonPropie.setText("Propietarios");
        bttonPropie.setBorder(null);
        bttonPropie.setFocusPainted(false);
        bttonPropie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonPropieActionPerformed(evt);
            }
        });

        bttonMascotas.setBackground(new java.awt.Color(0, 102, 102));
        bttonMascotas.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonMascotas.setForeground(new java.awt.Color(255, 255, 255));
        bttonMascotas.setText("Mascotas");
        bttonMascotas.setBorder(null);
        bttonMascotas.setBorderPainted(false);
        bttonMascotas.setFocusPainted(false);
        bttonMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonMascotasActionPerformed(evt);
            }
        });

        bttonCitas.setBackground(new java.awt.Color(0, 102, 102));
        bttonCitas.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonCitas.setForeground(new java.awt.Color(255, 255, 255));
        bttonCitas.setText("Citas");
        bttonCitas.setBorder(null);
        bttonCitas.setBorderPainted(false);
        bttonCitas.setFocusPainted(false);
        bttonCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonCitasActionPerformed(evt);
            }
        });

        bttonCitas1.setBackground(new java.awt.Color(0, 102, 102));
        bttonCitas1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonCitas1.setForeground(new java.awt.Color(255, 255, 255));
        bttonCitas1.setText("Cobros");
        bttonCitas1.setBorder(null);
        bttonCitas1.setFocusPainted(false);
        bttonCitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonCitas1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        bttonInicio.setBackground(new java.awt.Color(204, 255, 204));
        bttonInicio.setFont(new java.awt.Font("Montserrat Black", 0, 24)); 
        bttonInicio.setForeground(new java.awt.Color(0, 102, 102));
        bttonInicio.setText("Inicio");
        bttonInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
                .addGap(84, 84, 84)
                .addComponent(bttonInicio)
                .addContainerGap(85, Short.MAX_VALUE))
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
                        .addContainerGap(12, Short.MAX_VALUE)
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(bttonCitas1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(bttonPropie))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(bttonMascotas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(bttonCitas)
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
                .addComponent(bttonPropie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonMascotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttonCitas1)
                .addGap(327, 327, 327))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Citas para hoy");

        lblCitHoy.setBackground(new java.awt.Color(204, 255, 204));
        lblCitHoy.setFont(new java.awt.Font("Montserrat Black", 1, 48)); 
        lblCitHoy.setForeground(new java.awt.Color(0, 102, 102));
        lblCitHoy.setText("000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblCitHoy)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCitHoy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mascotas ");

        lblMascotasContador.setBackground(new java.awt.Color(204, 255, 204));
        lblMascotasContador.setFont(new java.awt.Font("Montserrat Black", 1, 48)); 
        lblMascotasContador.setForeground(new java.awt.Color(255, 255, 255));
        lblMascotasContador.setText("000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMascotasContador)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMascotasContador)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Montserrat Black", 1, 24)); 
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Agenda de hoy--------------------------------------------");

        tableRecepcionista.setBackground(new java.awt.Color(250, 246, 237));
        tableRecepcionista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hora", "Mascota", "Propietario", "Motivo"
            }
        ));
        tableRecepcionista.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tableRecepcionista);

        bttonRegProp.setBackground(new java.awt.Color(0, 153, 153));
        bttonRegProp.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonRegProp.setForeground(new java.awt.Color(255, 255, 255));
        bttonRegProp.setText("Registrar Propietario");
        bttonRegProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonRegPropActionPerformed(evt);
            }
        });

        bttonRegMasc.setBackground(new java.awt.Color(0, 153, 153));
        bttonRegMasc.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonRegMasc.setForeground(new java.awt.Color(255, 255, 255));
        bttonRegMasc.setText("Registrar Mascota");
        bttonRegMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonRegMascActionPerformed(evt);
            }
        });

        bttonAgenCita.setBackground(new java.awt.Color(0, 153, 153));
        bttonAgenCita.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonAgenCita.setForeground(new java.awt.Color(255, 255, 255));
        bttonAgenCita.setText("Agendar Cita");
        bttonAgenCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonAgenCitaActionPerformed(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huellitas.png"))); 

        bttonRegMasc1.setBackground(new java.awt.Color(0, 153, 153));
        bttonRegMasc1.setFont(new java.awt.Font("Montserrat Black", 0, 14)); 
        bttonRegMasc1.setForeground(new java.awt.Color(255, 255, 255));
        bttonRegMasc1.setText("Registrar Cobro");
        bttonRegMasc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonRegMasc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(lblIcon)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttonRegProp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttonRegMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttonAgenCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttonRegMasc1)))
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
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttonRegProp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttonRegMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttonAgenCita, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttonRegMasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void bttonPropieActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                           

    private void bttonMascotasActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                             

    private void bttonCitasActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                          

    private void bttonCitas1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                           

    private void bttonRegPropActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                            

    private void bttonRegMascActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                            

    private void bttonAgenCitaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                             

    private void bttonRegMasc1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
                                             

    


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonAgenCita;
    private javax.swing.JButton bttonCitas;
    private javax.swing.JButton bttonCitas1;
    private javax.swing.JButton bttonInicio;
    private javax.swing.JButton bttonMascotas;
    private javax.swing.JButton bttonPropie;
    private javax.swing.JButton bttonRegMasc;
    private javax.swing.JButton bttonRegMasc1;
    private javax.swing.JButton bttonRegProp;
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
    private javax.swing.JLabel lblCitHoy;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblMascotasContador;
    private javax.swing.JTable tableRecepcionista;
    // End of variables declaration//GEN-END:variables
}
