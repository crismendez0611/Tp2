package com.trabajopractico2.concesionriadeautosymotos.ListaVehiculos;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Vehiculo;

public class ListaVehiculo implements IFormateadorDePrecioFormatoArgentino {
    private Set<Vehiculo> vehiculos;
    // constructor
    /*
     * public ListaVehiculo(Set<Vehiculo> vehiculos) {
     * this.vehiculos = vehiculos;
     * }
     */

    public ListaVehiculo(Set<Vehiculo> vehiculos) {
        this.vehiculos = new LinkedHashSet<Vehiculo>();
    }

    /**
     * Metodo para imprimir la lista de vehiculos
     */

    public void imprimirVehiculos() {
        System.out.println("\n \n ");
        vehiculos.forEach(System.out::println);
    }

    /**
     * Metodo para agregar vehiculos a la lista
     * Utilizando varargs
     * 
     * @param v
     */
    public void AgregarVehiculos(Vehiculo... v) {
        for (int i = 0; i < v.length; i++) {
            vehiculos.add(v[i]);
        }
    }

    public void vehiculoMasCaro() {
        System.out.println("\n=============================\n");
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
    }

    public void vehiculoMasBarato() {
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
    }

    public void vehiculoConLetraY() {
        vehiculos
                .stream()
                .filter(v -> v.getMarca().toLowerCase().contains("y"))
                .forEach(v -> System.out.println(
                        "Vehiculo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo() + " "
                                + formatearPrecio(v.getPrecio())));
    }

    public void vehiculosOrdenadosPorPrecioDescendente() {
        System.out.println("\n=============================");
        System.out.println("\nVehiculos ordenados por precio de mayor a menor");
        vehiculos
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio)
                        .reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    public void ordenadosDeFormaNatural() {
        System.out.println("\n=============================");
        System.out.println("\nVehiculos ordenados de forma natural(por marca, modelo y precio)");
        Set<Vehiculo> vehiculos2 = new TreeSet<>(vehiculos);
        vehiculos2.addAll(vehiculos);
        vehiculos2.forEach(System.out::println);
    }

}