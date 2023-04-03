package org.example.controler;

import org.example.model.platoPolleria;
import org.example.model.precioMezaPolleria;

import javax.swing.*;
import java.util.ArrayList;

public class controller {

    public platoPolleria ingresarPlatos(String name, double price) {
        return new platoPolleria(name, price, 1);
    }

    public precioMezaPolleria ingresarMeza(int numClientes, double totalprecio, String nameCLiente, ArrayList<platoPolleria> platos) {
        return new precioMezaPolleria(numClientes, totalprecio, nameCLiente, platos);
    }

    public int salir() {
        return JOptionPane.showConfirmDialog(null,
                "ESTA SEGURO QUE DESEA SALIR",
                "",
                JOptionPane.YES_NO_OPTION);
    }

    public double totalPrecioMeza(ArrayList<platoPolleria> precioMezaPollerias) {
        double total = 0;
        for (platoPolleria p : precioMezaPollerias) {
            total += p.getPrecio();
        }
        return total;
    }

    public precioMezaPolleria[] aumentar(precioMezaPolleria[] matriz, int cont) {
        precioMezaPolleria[] aumento = new precioMezaPolleria[cont + 5];
        for (int i = 0; i < cont; i++) {
            aumento[i] = matriz[i];
        }
        return aumento;
    }
}
