package com.trabajopractico2.concesionriadeautosymotos.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode (callSuper = true)
public class Moto extends Vehiculo {
    private String cilindrada;
    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString() {
       return "Marca: "+ getMarca()+"//Modelo: "+ getModelo()+"//Cilindrada: "+ getCilindrada()+"//Precio: "+getPrecio();
    } 
}
