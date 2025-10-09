package com.trabajopractico2.concecionriadeautosymotos.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@EqualsAndHashCode (callSuper = true)

public class Auto  extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo,int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

}
