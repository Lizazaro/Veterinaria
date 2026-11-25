package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;

public class ListaCobros extends JFrame {
    private static final Color BEIGE = new Color(250, 246, 237);
    private static final Color TEAL = new Color(0, 102, 102);
    private static final Color ACCENT = new Color(0, 153, 153);

    public ListaCobros() {
        initComponents();
        bttonCerrar.addActionListener(e -> dispose());
    }

    public JTable getTblRegistros() {
        return tblRegistros;
    }

    public JScrollPane getSpRegistros() {
        return spRegistros;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlContenido = new JPanel();
        lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/images/huellitas-mini.png")).getImage().getScaledInstance(68, 68, Image.SCALE_SMOOTH)));
        lblLogo.setPreferredSize(new Dimension(68, 68));
        lblMarca = new JLabel("Huellitas4Life");
        lblMarca.setFont(new Font("Montserrat Black", Font.BOLD, 25));
        lblMarca.setForeground(TEAL);
        lblTitulo = new JLabel("Cobros realizados");
        lblTitulo.setFont(new Font("Montserrat Black", Font.BOLD, 21));
        lblTitulo.setForeground(TEAL);
        separador = new JSeparator();
        separador.setForeground(ACCENT);
        lblLista = new JLabel("Cobros realizados");
        lblLista.setFont(new Font("Montserrat Black", Font.BOLD, 14));
        lblLista.setForeground(TEAL);
        tblRegistros = new JTable();
        tblRegistros.setModel(new DefaultTableModel(new Object[0][7], new String[]{"N.° comprobante", "Fecha", "Propietario", "Mascota", "Concepto", "Total", "Estado"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblRegistros.setRowHeight(27);
        tblRegistros.setFont(new Font("Montserrat", Font.PLAIN, 12));
        tblRegistros.getTableHeader().setFont(new Font("Montserrat Black", Font.BOLD, 12));
        tblRegistros.getTableHeader().setReorderingAllowed(false);
        tblRegistros.setSelectionBackground(new Color(204, 255, 204));
        tblRegistros.setSelectionForeground(TEAL);
        tblRegistros.setFillsViewportHeight(true);
        spRegistros = new JScrollPane();
        spRegistros.setViewportView(tblRegistros);
        spRegistros.getViewport().setBackground(BEIGE);
        bttonCerrar = new JButton("Cerrar");
        bttonCerrar.setFont(new Font("Montserrat ExtraBold", Font.BOLD, 14));
        bttonCerrar.setBackground(ACCENT);
        bttonCerrar.setForeground(Color.WHITE);
        bttonCerrar.setFocusPainted(false);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Huellitas4Life - Cobros realizados");
        pnlContenido.setBackground(BEIGE);
        pnlContenido.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(205, 198, 187)),
                "Huellitas4Life - Cobros realizados", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Montserrat Black", Font.BOLD, 15), TEAL));
        pnlContenido.setLayout(new GroupLayout(pnlContenido));
        GroupLayout layout = (GroupLayout) pnlContenido.getLayout();
        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(18)
                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE).addGap(18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblMarca).addComponent(lblTitulo))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(spRegistros, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(18).addComponent(bttonCerrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createSequentialGroup().addGap(12)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addComponent(lblMarca).addComponent(lblTitulo)))
            .addGap(6).addComponent(separador, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(8)
            .addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addComponent(spRegistros, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE).addGap(6)
            .addComponent(bttonCerrar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addContainerGap(12, Short.MAX_VALUE));
        GroupLayout rootLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(rootLayout);
        rootLayout.setHorizontalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rootLayout.createSequentialGroup().addGap(10).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(10)));
        rootLayout.setVerticalGroup(rootLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rootLayout.createSequentialGroup().addGap(8).addComponent(pnlContenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(8)));
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
    private JLabel lblLista;
    private JTable tblRegistros;
    private JScrollPane spRegistros;
    private JButton bttonCerrar;
    // End of variables declaration//GEN-END:variables
}
