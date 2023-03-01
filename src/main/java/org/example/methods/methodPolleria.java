package org.example.methods;

import org.example.model.platoPolleria;
import org.example.model.precioMezaPolleria;

import javax.swing.*;
import java.util.ArrayList;

public class methodPolleria {
    private precioMezaPolleria[] matriz = new precioMezaPolleria[10000];
    private double price = 0;
    private int cont = 1;
    String nameCLient = "";
    ArrayList<platoPolleria> platos = new ArrayList<>();
    String[] menu = new String[]{
            "INGRESAR",
            "MOSTRAR",
            "BUSCAR",
            "SALIR"
    };
    String[] menu2 = new String[]{
            "1/4 Pollo, porcion de papas y ensalada --- S/.15.00",
            "1/2 Pollo, porcion de papas y ensalada --- S/.30.00",
            "1 Pollo, porcion de papas y ensalada --- S/.60.00",
            "Gaseosa InKa Kola 3L --- S/.10.00",
            "Terminar Pedido",
            "SALIR"
    };

    void menu() {
        String rpta = (String) JOptionPane.showInputDialog(null,
                "ingrese una de las opciones:",
                "POLLERIA D' ANTHONY",
                JOptionPane.PLAIN_MESSAGE,
                null,
                menu,
                menu[0]);
        options(rpta);
    }

    void menu2() {
        String rpta = (String) JOptionPane.showInputDialog(null,
                "ingrese platos:",
                "POLLERIA D' ANTHONY",
                JOptionPane.PLAIN_MESSAGE,
                null,
                menu2,
                menu2[0]);
        options2(rpta);

    }

    void options(String rpta) {
        if (rpta.equals(menu[0])) {
            nameCLient = JOptionPane.showInputDialog(null, "Ingrese Nombre del Cliente");
            menu2();
        }
        if (rpta.equals(menu[1])) view();

        if (rpta.equals(menu[2])) search();

        if (rpta.equals(menu[3])) exit();

    }

    void options2(String rpta) {
        platoPolleria polleria;
        if (rpta.equals(menu2[0])) {
            price += 15;
            polleria = new platoPolleria(menu2[0], price, 1);
            platos.add(polleria);
        } else if (rpta.equals(menu2[1])) {
            price += 30;
            polleria = new platoPolleria(menu2[1], price, 1);
            platos.add(polleria);
        } else if (rpta.equals(menu2[2])) {
            price += 60;
            polleria = new platoPolleria(menu2[2], price, 1);
            platos.add(polleria);
        } else if (rpta.equals(menu2[3])) {
            price += 10;
            polleria = new platoPolleria(menu2[3], price, 1);
            platos.add(polleria);
        } else if (rpta.equals(menu2[4])) {
            enteData();
        } else {
            menu();
        }
        menu2();
    }

    void search() {
        try {
            String rpta = JOptionPane.showInputDialog("Ingrese id a buscar:");
            for (int i = 0; i < cont; i++) {
                if (Long.parseLong(rpta) == matriz[i].getId()) {
                    JOptionPane.showMessageDialog(null, matriz[i].toString());
                }
            }
        } catch (Exception e) {
            menu();
        }
    }

    void view() {
        String texto = "ID" + "\t" + "NOMBRE CLIENTE" + "\t" + "MONTO" + "\n";
        texto += "-------------------------------------------------------------------------------------------------\n";
        JTextArea m1 = new JTextArea(20, 50);
        JScrollPane m2 = new JScrollPane(m1);
        for (int i = 0; i < cont - 1; i++) {
            texto += matriz[i].getId() + "\t" + matriz[i].getNombreCliente() + "\t\t" + matriz[i].getPrecio() + "\n";
        }
        m1.append(texto);
        JOptionPane.showMessageDialog(null, m2, "LISTA DE VENDEDORES", JOptionPane.INFORMATION_MESSAGE);
        menu();
    }

    void enteData() {
        int contm = cont - 1;
        precioMezaPolleria precioMeza = new precioMezaPolleria(cont, price, nameCLient, platos);
        matriz[contm] = precioMeza;
        platos = new ArrayList<>();
        price = 0;
        nameCLient = "";
        cont++;
        menu();
    }

    void exit() {
        int aux = JOptionPane.showConfirmDialog(null,
                "ESTA SEGURO QUE DESEA SALIR",
                "",
                JOptionPane.YES_NO_OPTION);
        if (aux == 0) {
            System.exit(0);
        } else {
            menu();
        }
    }

    void ordernar(int id) {

    }
}
