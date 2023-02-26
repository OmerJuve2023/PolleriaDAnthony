package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class precioMezaPolleria {
    @Override
    public String toString() {
        String txt = "";
        for (platoPolleria plato : plato) {
            txt += "Nombre:\t" + plato.getPlato() + "\n" +
                    "Cantidad de Platos:\t" + plato.getCantidad() + "\n" +
                    "Precio del Plato:\t" + plato.getPrecio();
        }
        return "precioMezaPolleria{" +
                "id:\t" + id + "\n" +
                "precio:\t" + precio + "\n" +
                "nombreCliente:\t" + nombreCliente + "\n" +
                ", platos:\n" + txt;
    }

    private long id;
    private double precio;
    private String nombreCliente;
    private List<platoPolleria> plato = new ArrayList<>();

    public precioMezaPolleria() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<platoPolleria> getPlato() {
        return plato;
    }

    public void setPlato(ArrayList<platoPolleria> plato) {
        this.plato = plato;
    }

}
