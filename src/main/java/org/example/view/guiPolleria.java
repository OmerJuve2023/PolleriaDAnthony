package org.example.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class guiPolleria extends JFrame implements ActionListener, WindowListener {
    private final viewPolleria polleria = new viewPolleria();
    private final JPanel panelContenedor;

    public guiPolleria() throws HeadlessException {
        JFrame ventana = new JFrame("Polleria D'Anthony");
        ventana.setVisible(true);
        ventana.setSize(1010, 450);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        this.addWindowListener(this);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelContenedor = new JPanel();
        panelContenedor.setLayout(new GroupLayout(panelContenedor));
        ventana.add(panelContenedor);
        title();
        formData();
        enterData();
        optionButtons();
        viewTable();
        pack();
    }

    private void title() {
        JLabel title = new JLabel("Ingrese Datos");
        title.setSize(150, 20);
        title.setLocation(10, 20);
        title.setFont(new Font("Cascadia Code", Font.BOLD, 18));
        panelContenedor.add(title);
    }

    private void formData() {
        JLabel name = new JLabel();
        name.setText("Nombre");
        name.setFont(new Font("Cascadia Code", Font.BOLD, 13));
        name.setSize(60, 20);
        name.setLocation(10, 70);
        panelContenedor.add(name);

        JTextField tname = new JTextField();
        tname.setSize(100, 20);
        tname.setLocation(80, 70);
        tname.isFocusable();
        panelContenedor.add(tname);

        JLabel plato = new JLabel("Plato");
        plato.setFont(new Font("Cascadia Code", Font.BOLD, 13));
        plato.setSize(45, 20);
        plato.setLocation(200, 70);
        plato.isFocusable();
        panelContenedor.add(plato);

        JComboBox<String> jComboBox = new JComboBox<>();
        jComboBox.setFont(new Font("Cascadia Code", Font.BOLD, 11));
        jComboBox.setSize(270, 20);
        jComboBox.setLocation(270, 70);
        jComboBox.setModel(new DefaultComboBoxModel<>(polleria.menu2));
        jComboBox.isFocusable();
        panelContenedor.add(jComboBox);
    }

    private void enterData() {

        JLabel pedido = new JLabel();
        pedido.setText("Pedido");
        pedido.setFont(new Font("Cascadia Code", Font.BOLD, 13));
        pedido.setSize(80, 20);
        pedido.setLocation(10, 140);
        panelContenedor.add(pedido);

        JButton bGuardar = new JButton();
        bGuardar.setText("Guardar Pedido");
        bGuardar.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 14));
        bGuardar.setSize(140, 30);
        bGuardar.setLocation(100, 135);
        panelContenedor.add(bGuardar);


        JTextArea tPedido = new JTextArea();
        tPedido.setFont(new Font("Cascadia Code", Font.BOLD, 13));
        tPedido.setSize(530, 200);
        tPedido.setLocation(10, 180);
        //tPedido.setEnabled(false);
        panelContenedor.add(tPedido);
    }

    private void optionButtons() {
        JButton bEditar = new JButton();
        bEditar.setText("Editar Pedido");
        bEditar.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 14));
        bEditar.setSize(135, 30);
        bEditar.setLocation(550, 20);
        panelContenedor.add(bEditar);

        JButton bEliminar = new JButton();
        bEliminar.setText("Eliminar Pedido");
        bEliminar.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 14));
        bEliminar.setSize(140, 30);
        bEliminar.setLocation(700, 20);
        panelContenedor.add(bEliminar);

        JButton bBuscar = new JButton();
        bBuscar.setText("Buscar Pedido");
        bBuscar.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 14));
        bBuscar.setSize(130, 30);
        bBuscar.setLocation(850, 20);
        panelContenedor.add(bBuscar);
    }

    private void viewTable() {
        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane();
        table.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); // NOI18N
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {"1", "Jose", 10.00},
                        {"2", "Alberto", 30.00},
                        {"3", "Manuel", 30.00},
                        {"4", "Romario", 90.00}
                },
                new String[]{
                        "ID", "Nombre", "Monto"
                }
        ));
        table.setSize(400, 200);
        table.setLocation(550, 100);
        table.setEnabled(false);
        scrollPane.setViewportView(table);
        scrollPane.setSize(400, 200);
        scrollPane.setLocation(550, 100);
        panelContenedor.add(scrollPane);
    }

    public static void main(String[] args) {
        new guiPolleria();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
