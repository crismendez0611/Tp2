package com.trabajopractico2.concesionriadeautosymotos.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Auto;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Moto;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Vehiculo;

public class Tests {
    public static void main(String[] args) {
        System.out.println("Concesionaria de autos y motos");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
        vehiculos.add(new Moto("Honda", "Titan", "125cc", 60000.00));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        vehiculos.add(new Moto("Yamaha", "YBR", "160cc", 80500.50));
        // Imprimir los vehiculos
        System.out.println("\n");
        vehiculos.forEach(System.out::println);
        System.out.println("\n ============================= \n");
        // Busacar el precio alto
        double precioMax = vehiculos
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        // Imprimir el vehiculo con precio alto
        vehiculos
                .stream()
                .filter(v -> v.getPrecio() == precioMax)
                .forEach(v -> System.out.println("Vehiculo mas caro: " + v.getMarca() + " " + v.getModelo()));

        // Buscar el precio bajo
        double precioMin = vehiculos
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        // Imprimir el vehiculo con precio bajo
        vehiculos
                .stream()
                .filter(v -> v.getPrecio() == precioMin)
                .forEach(v -> System.out.println("Vehiculo mas barato: " + v.getMarca() + " " + v.getModelo()));
        // Imprimir los vehiculos que contienen la letra "Y"
        vehiculos
                .stream()
                .filter(v -> v.getMarca().toLowerCase().contains("y"))
                .forEach(v -> System.out.println(
                        "Vehiculo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo()));
        // Imprimir los vehiculos ordenados por precio de mayor a menor
        System.out.println("\n ============================= \n");
        vehiculos
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
        System.out.println("\n ============================= \n");
        System.out.println("Ordenados de forma natural");
        Set<Vehiculo> vehiculos2 = new TreeSet<>(vehiculos);
        vehiculos2.addAll(vehiculos);
        vehiculos2.forEach(System.out::println);
    }
}
