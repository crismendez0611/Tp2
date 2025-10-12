package com.trabajopractico2.concesionriadeautosymotos.vehiculos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;
    /**
     * Metodo para comparar dos vehiculos
     * Para poder ordenar los vehiculos de forma natural
     * @param vehiculo2 Vehiculo a comparar
     * @return int Resultado de la comparacion
     */
    public int compareTo(Vehiculo vehiculo2) {
        String vehiculoOriginal = this.marca + " " + this.modelo + " " + this.precio;
        String vehiculoAComparar = vehiculo2.getMarca() + " " + vehiculo2.getModelo() + " " + vehiculo2.getPrecio();
        return vehiculoOriginal.compareTo(vehiculoAComparar);
    }
}
