package com.trabajopractico2.concesionriadeautosymotos.vehiculos;

import java.text.NumberFormat;
import java.util.Locale;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String toString() {
        NumberFormat formateador = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-AR"));
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + cilindrada +
                "c // Precio: " + formateador.format(getPrecio());
    }
    /*
     * Segun la explición de chat gpt
     * NumberFormat formateador =
     * NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-AR"));
     * Crea un formateador de moneda, configurado para el idioma y país de
     * Argentina (es-AR).
     * 
     * Ese objeto formateador sabe cómo mostrar los precios según las reglas
     * locales:
     * 
     * Usa coma (,) para los decimales.
     * 
     * Usa punto (.) para separar miles.
     * 
     * Agrega el símbolo de moneda $.
     * formateador.format(precio) → convierte el número en el formato argentino
     */

}
