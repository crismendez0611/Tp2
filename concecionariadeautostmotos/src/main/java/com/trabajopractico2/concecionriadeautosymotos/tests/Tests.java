package com.trabajopractico2.concecionriadeautosymotos.tests;

import java.util.ArrayList;
import java.util.List;

import com.trabajopractico2.concecionriadeautosymotos.vehiculos.Auto;
import com.trabajopractico2.concecionriadeautosymotos.vehiculos.Moto;
import com.trabajopractico2.concecionriadeautosymotos.vehiculos.Vehiculo;

public class Tests {
    public static void main(String[] args) {
        System.out.println("Concesionaria de autos y motos");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
        vehiculos.add(new Moto("Honda", "Titan", "125cc", 60000.00));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        vehiculos.add(new Moto("Yamaha", "YBR", "160cc", 80500.50));

        System.out.println("\n ============================= \n");
        

    }
}
