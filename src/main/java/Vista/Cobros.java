package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
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
        lblTitulo.setText("Cobros y comprobantes");
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        separador = new JSeparator();
        lblPendientes = new JLabel();
        lblPendientes.setText("Consultas pendientes de cobro");
        lblPendientes.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblPendientes.setForeground(TEAL);
        tblPendientes = new JTable();
        tblPendientes.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"N.º", "Fecha", "Mascota", "Propietario", "Productos"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblPendientes.setRowHeight(27);
        tblPendientes.setFont(new Font("Montserrat", Font.PLAIN, 12));
        tblPendientes.getTableHeader().setFont(new Font("Montserrat Black", Font.BOLD, 12));
        tblPendientes.getTableHeader().setReorderingAllowed(false);
        tblPendientes.setSelectionBackground(new Color(204, 255, 204));
        tblPendientes.setSelectionForeground(TEAL);
        spPendientes = new JScrollPane();
        spPendientes.setViewportView(tblPendientes);
        lblDetalle = new JLabel();
        lblDetalle.setText("Vacunas, medicamentos y procedimientos de la consulta seleccionada");
        lblDetalle.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblDetalle.setForeground(TEAL);
        tblDetalleCobro = new JTable();
        tblDetalleCobro.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Tipo", "Producto", "Dosis / detalle", "Cantidad", "Precio unitario", "Subtotal"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblDetalleCobro.setRowHeight(27);
        tblDetalleCobro.setFont(new Font("Montserrat", Font.PLAIN, 12));
        tblDetalleCobro.getTableHeader().setFont(new Font("Montserrat Black", Font.BOLD, 12));
        tblDetalleCobro.getTableHeader().setReorderingAllowed(false);
        tblDetalleCobro.setSelectionBackground(new Color(204, 255, 204));
        tblDetalleCobro.setSelectionForeground(TEAL);
        spDetalle = new JScrollPane();
        spDetalle.setViewportView(tblDetalleCobro);
        lblTarifa = new JLabel();
        lblTarifa.setText("Tarifa base de consulta");
        lblTarifa.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblTarifa.setForeground(TEAL);
        txtTarifaBase = new JTextField();
        txtTarifaBase.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtTarifaBase.setColumns(20);
        lblRecargo = new JLabel();
        lblRecargo.setText("Recargo exótico (25%)");
        lblRecargo.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblRecargo.setForeground(TEAL);
        txtRecargo = new JTextField();
        txtRecargo.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtRecargo.setColumns(20);
        chkDescuento = new JCheckBox();
        chkDescuento.setText("Aplicar 10% (propietario con más de 2 mascotas)");
        chkDescuento.setFont(new Font("Montserrat", Font.BOLD, 13));
        chkDescuento.setBackground(BEIGE);
        chkDescuento.setForeground(TEAL);
        lblTotal = new JLabel();
        lblTotal.setText("TOTAL A PAGAR");
        lblTotal.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblTotal.setForeground(TEAL);
        txtTotal = new JTextField();
        txtTotal.setFont(new Font("Montserrat", Font.PLAIN, 14));
        txtTotal.setColumns(20);
        bttonGenerarComprobante = new JButton();
        bttonGenerarComprobante.setText("Registrar cobro");
        bttonGenerarComprobante.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonGenerarComprobante.setBackground(ACCENT);
        bttonGenerarComprobante.setForeground(Color.WHITE);
        bttonGenerarComprobante.setFocusPainted(false);
        bttonCancelar = new JButton();
        bttonCancelar.setText("Cerrar");
        bttonCancelar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonCancelar.setBackground(ACCENT);
        bttonCancelar.setForeground(Color.WHITE);
        bttonCancelar.setFocusPainted(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Cobros y comprobantes");
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(205, 198, 187)), "Huellitas4Life - Cobros y comprobantes", TitledBorder.CENTER, TitledBorder.TOP, new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        separador.setForeground(ACCENT);
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo)).addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblPendientes, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spPendientes, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblDetalle, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spDetalle, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblTarifa, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtTarifaBase, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(lblRecargo, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtRecargo, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(chkDescuento, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(bttonGenerarComprobante, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE).addGap(10).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addComponent(lblPendientes, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spPendientes, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(lblDetalle, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(spDetalle, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblTarifa, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtTarifaBase, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(lblRecargo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtRecargo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addComponent(chkDescuento, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)).addGap(6)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(bttonGenerarComprobante, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addComponent(bttonCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)).addGap(6)
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
    private JLabel lblPendientes;
    private JTable tblPendientes;
    private JScrollPane spPendientes;
    private JLabel lblDetalle;
    private JTable tblDetalleCobro;
    private JScrollPane spDetalle;
    private JLabel lblTarifa;
    private JTextField txtTarifaBase;
    private JLabel lblRecargo;
    private JTextField txtRecargo;
    private JCheckBox chkDescuento;
    private JLabel lblTotal;
    private JTextField txtTotal;
    private JButton bttonGenerarComprobante;
    private JButton bttonCancelar;
    // End of variables declaration//GEN-END:variables
}
