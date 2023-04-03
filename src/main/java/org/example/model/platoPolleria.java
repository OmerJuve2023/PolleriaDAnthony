package org.example.model;

public class platoPolleria {
    private String plato;
    private double precio;
    private int cantidad;

    public platoPolleria(String plato, double precio, int cantidad) {
        this.plato = plato;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getPlato() {
        return plato;
    }

    public double getPrecio() {
        return precio;
    }


    public int getCantidad() {
        return cantidad;
    }


    public String toString() {
        return "platoPolleria{" +
                "plato='" + plato + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
