package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
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
        lblTitulo.setText("Agendar cita");
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        separador = new JSeparator();
        lblCampo1 = new JLabel();
        lblCampo1.setText("Mascota");
        lblCampo1.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo1.setForeground(TEAL);
        txtMascota = new JTextField();
        txtMascota.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtMascota.setColumns(20);
        lblCampo2 = new JLabel();
        lblCampo2.setText("Propietario");
        lblCampo2.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo2.setForeground(TEAL);
        txtPropietario = new JTextField();
        txtPropietario.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtPropietario.setColumns(20);
        txtPropietario.setEditable(false);
        txtPropietario.setBackground(new Color(240, 237, 229));
        lblCampo3 = new JLabel();
        lblCampo3.setText("Médico veterinario");
        lblCampo3.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo3.setForeground(TEAL);
        txtVeterinario = new JTextField();
        txtVeterinario.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtVeterinario.setColumns(20);
        lblCampo4 = new JLabel();
        lblCampo4.setText("Fecha");
        lblCampo4.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo4.setForeground(TEAL);
        txtFecha = new JTextField();
        txtFecha.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtFecha.setColumns(20);
        lblCampo5 = new JLabel();
        lblCampo5.setText("Hora");
        lblCampo5.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo5.setForeground(TEAL);
        txtHora = new JTextField();
        txtHora.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtHora.setColumns(20);
        lblCampo6 = new JLabel();
        lblCampo6.setText("Motivo de la cita");
        lblCampo6.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblCampo6.setForeground(TEAL);
        txtMotivo = new JTextField();
        txtMotivo.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtMotivo.setColumns(20);
        bttonGuardarCita = new JButton();
        bttonGuardarCita.setText("Agendar cita");
        bttonGuardarCita.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonGuardarCita.setBackground(ACCENT);
        bttonGuardarCita.setForeground(Color.WHITE);
        bttonGuardarCita.setFocusPainted(false);
        bttonCancelar = new JButton();
        bttonCancelar.setText("Cancelar");
        bttonCancelar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonCancelar.setBackground(ACCENT);
        bttonCancelar.setForeground(Color.WHITE);
        bttonCancelar.setFocusPainted(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Agendar cita");
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(205, 198, 187)), "Huellitas4Life - Agendar cita", TitledBorder.CENTER, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        separador.setForeground(ACCENT);
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo)).addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtMascota, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo2, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo3, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtVeterinario, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo4, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo5, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtHora, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblCampo6, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtMotivo, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(bttonGuardarCita, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtPropietario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtVeterinario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtHora, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCampo6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtMotivo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(bttonGuardarCita, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addGap(6)
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
    private JLabel lblCampo1;
    private JTextField txtMascota;
    private JLabel lblCampo2;
    private JTextField txtPropietario;
    private JLabel lblCampo3;
    private JTextField txtVeterinario;
    private JLabel lblCampo4;
    private JTextField txtFecha;
    private JLabel lblCampo5;
    private JTextField txtHora;
    private JLabel lblCampo6;
    private JTextField txtMotivo;
    private JButton bttonGuardarCita;
    private JButton bttonCancelar;
    // End of variables declaration//GEN-END:variables
}
