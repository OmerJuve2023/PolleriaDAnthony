package org.example.methods;

import org.example.model.platoPolleria;
import org.example.model.precioMezaPolleria;

import javax.swing.*;
import java.util.ArrayList;

public class methodPolleria {
    private precioMezaPolleria[] matriz = new precioMezaPolleria[1];
    private double price = 0;
    private int cont = 1;
    String nameCLient = "";
    ArrayList<platoPolleria> platos = new ArrayList<>();
    String[] menu = new String[]{
            "INGRESAR",
            "MOSTRAR",
            "BUSCAR",
            "MODIFICAR",
            "ELIMINAR",
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

    public void menu() {
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
        if (rpta.equals(menu[3])) modificar();
        if (rpta.equals(menu[4])) eliminar();
        if (rpta.equals(menu[5])) exit();

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
        if (cont > 2) ordenar();
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
        if ((cont) > matriz.length) aumentar();
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

    private void ordenar() {
        long id;
        String name;
        double precio;
        ArrayList<platoPolleria> platoPollo;
        for (int i = 0; i < cont - 2; i++) {
            for (int j = i + 1; j < cont - 1; j++) {
                if (matriz[j].getPrecio() > matriz[i].getPrecio()) {

                    id = matriz[i].getId();
                    matriz[i].setId(matriz[j].getId());
                    matriz[j].setId(id);

                    name = matriz[i].getNombreCliente();
                    matriz[i].setNombreCliente(matriz[j].getNombreCliente());
                    matriz[j].setNombreCliente(name);

                    precio = matriz[i].getPrecio();
                    matriz[i].setPrecio(matriz[j].getPrecio());
                    matriz[j].setPrecio(precio);

                    platoPollo = (ArrayList<platoPolleria>) matriz[i].getPlato();
                    matriz[i].setPlato(matriz[j].getPlato());
                    matriz[j].setPlato(platoPollo);
                }
            }
        }
    }

    private void eliminar() {
        try {
            String rpta = JOptionPane.showInputDialog("Ingrese id a buscar:");
            int b = 0;
            for (int i = 0; i < cont; i++) {
                if (Long.parseLong(rpta) == matriz[i].getId()) {
                    b = i;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro id");
                    menu();
                }
            }

           /* for (int i = b; i < cont--; i++) {
                matriz[i] = matriz[i + 1];
            }*/
            cont--;
        } catch (Exception e) {
            menu();
        }
    }

    private void modificar() {
        try {
            String rpta = JOptionPane.showInputDialog("Ingrese id a buscar:");
            int b = -1;
            for (int i = 0; i < cont; i++) {
                if (Long.parseLong(rpta) == matriz[i].getId()) {
                    b = i;
                    break;
                }
            }
            if (b == -1) {
                JOptionPane.showMessageDialog(null, "el id no existe");
                menu();
            }
            String name = JOptionPane.showInputDialog(null, "Ingrese nuevo nombre");
            String rptas;
            double precio = 0;
            platoPolleria polleria;
            do {
                rptas = (String) JOptionPane.showInputDialog(null,
                        "ingrese platos:",
                        "POLLERIA D' ANTHONY",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        menu2,
                        menu2[0]);
                if (rptas.equals(menu2[0])) {
                    precio += 15;
                    polleria = new platoPolleria(rptas, precio, 1);
                    platos.add(polleria);
                } else if (rptas.equals(menu2[1])) {
                    precio += 30;
                    polleria = new platoPolleria(rptas, precio, 1);
                    platos.add(polleria);
                } else if (rptas.equals(menu2[2])) {
                    precio += 60;
                    polleria = new platoPolleria(rptas, precio, 1);
                    platos.add(polleria);
                } else if (rptas.equals(menu2[3])) {
                    price += 10;
                    polleria = new platoPolleria(rptas, precio, 1);
                    platos.add(polleria);
                }
            } while (rpta.equals(menu2[4]));

            matriz[b].setPrecio(precio);
            matriz[b].setNombreCliente(name);
            matriz[b].setPlato(platos);
            matriz[b].setId(matriz[b].getId());
            platos = new ArrayList<>();

        } catch (Exception e) {
            menu();
        }
    }

    private void aumentar() {
        precioMezaPolleria[] aumento = new precioMezaPolleria[cont + 1];
        for (int i = 0; i < cont - 1; i++) {
            aumento[i] = matriz[i];
        }
        matriz = aumento;
    }
}
