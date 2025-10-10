package com.trabajopractico2.concesionriadeautosymotos.vehiculos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;
    @Override
    public int compareTo(Vehiculo vehiculo2) {
        String vehiculoOriginal=this.marca+" "+this.modelo+" "+this.precio;
        String vehiculoAComparar=vehiculo2.getMarca()+" "+vehiculo2.getModelo()+" "+vehiculo2.getPrecio();
        return vehiculoOriginal.compareTo(vehiculoAComparar);
    }
}
