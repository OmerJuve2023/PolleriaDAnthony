package org.example.model;

import java.util.List;

public class precioMezaPolleria {
    public precioMezaPolleria(long id, double precio, String nombreCliente, List<platoPolleria> plato) {
        this.id = id;
        this.precio = precio;
        this.nombreCliente = nombreCliente;
        this.plato = plato;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setPlato(List<platoPolleria> plato) {
        this.plato = plato;
    }

    public String toString() {
        String txt = "";
        for (platoPolleria plato : plato) {
            txt += "Nombre:\t" + plato.getPlato() + "\n" +
                    "Cantidad de Platos:\t" + plato.getCantidad() + "\n" +
                    "Precio del Plato:\t" + plato.getPrecio() + "\n";
        }
        return "Precio Meza Polleria" +
                "id:\t" + id + "\n" +
                "precio:\t" + precio + "\n" +
                "nombreCliente:\t" + nombreCliente + "\n" +
                "platos:\n" + txt;
    }

    private long id;
    private double precio;
    private String nombreCliente;
    private List<platoPolleria> plato;

    public long getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public List<platoPolleria> getPlato() {
        return plato;
    }
}
