package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

public class HistorialClinico extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);

    public HistorialClinico() {
        initComponents();
        bttonCerrar.addActionListener(e -> dispose());
    }
    public void setControlador(ActionListener controlador){
    bttonBuscar.setActionCommand("buscarHistorial");
    bttonBuscar.addActionListener(controlador);
    }

    public JTextField getTxtBuscarMascota() {
        return txtBuscarMascota;
    }

    public JTable getTblHistorial() {
        return tblHistorial;
    }

    public JScrollPane getSpHistorial() {
        return spHistorial;
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
        lblTitulo.setText("Historial clínico");
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        separador = new JSeparator();
        lblBuscar = new JLabel();
        lblBuscar.setText("Buscar mascota");
        lblBuscar.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblBuscar.setForeground(TEAL);
        txtBuscarMascota = new JTextField();
        txtBuscarMascota.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtBuscarMascota.setColumns(20);
        bttonBuscar = new JButton();
        bttonBuscar.setText("Buscar");
        bttonBuscar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonBuscar.setBackground(ACCENT);
        bttonBuscar.setForeground(Color.WHITE);
        bttonBuscar.setFocusPainted(false);
        lblLista = new JLabel();
        lblLista.setText("Atenciones y productos registrados");
        lblLista.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblLista.setForeground(TEAL);
        tblHistorial = new JTable();
        tblHistorial.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Fecha", "Mascota", "Propietario", "Diagnóstico", "Vacunas / tratamientos", "Notas"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblHistorial.setRowHeight(27);
        tblHistorial.setFont(new Font("Montserrat", Font.PLAIN, 12));
        tblHistorial.getTableHeader().setFont(new Font("Montserrat Black", Font.BOLD, 12));
        tblHistorial.getTableHeader().setReorderingAllowed(false);
        tblHistorial.setSelectionBackground(new Color(204, 255, 204));
        tblHistorial.setSelectionForeground(TEAL);
        spHistorial = new JScrollPane();
        spHistorial.setViewportView(tblHistorial);
        bttonCerrar = new JButton();
        bttonCerrar.setText("Cerrar");
        bttonCerrar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonCerrar.setBackground(ACCENT);
        bttonCerrar.setForeground(Color.WHITE);
        bttonCerrar.setFocusPainted(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Historial clínico");
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(205, 198, 187)), "Huellitas4Life - Historial clínico", TitledBorder.CENTER, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        separador.setForeground(ACCENT);
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo)).addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblBuscar, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtBuscarMascota, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(bttonBuscar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spHistorial, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(bttonCerrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblBuscar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtBuscarMascota, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(bttonBuscar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spHistorial, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(bttonCerrar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addGap(6)
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
    private JLabel lblBuscar;
    private JTextField txtBuscarMascota;
    private JButton bttonBuscar;
    private JLabel lblLista;
    private JTable tblHistorial;
    private JScrollPane spHistorial;
    private JButton bttonCerrar;
    // End of variables declaration//GEN-END:variables
}
