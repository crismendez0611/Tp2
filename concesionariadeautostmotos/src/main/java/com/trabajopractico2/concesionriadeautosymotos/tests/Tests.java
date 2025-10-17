package com.trabajopractico2.concesionriadeautosymotos.tests;

import com.trabajopractico2.concesionriadeautosymotos.ListaVehiculos.ListaVehiculo;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Auto;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Moto;
import com.trabajopractico2.concesionriadeautosymotos.vehiculos.Vehiculo;

public class Tests {
    public static void main(String[] args) {
        Vehiculo auto1 = new Auto("Peugeot", "206", 4, 200000.00);
        Vehiculo moto1 = new Moto("Honda", "Titan", "125", 60000.00);
        Vehiculo auto2 = new Auto("Peugeot", "208", 5, 250000.00);
        Vehiculo moto2 = new Moto("Yamaha", "YBR", "160", 80500.50);
        ListaVehiculo listaVehiculo = new ListaVehiculo(null);
        listaVehiculo.AgregarVehiculos(auto1, moto1, auto2, moto2);
        listaVehiculo.imprimirVehiculos();
        listaVehiculo.vehiculoMasCaro();
        listaVehiculo.vehiculoMasBarato();
        listaVehiculo.vehiculoConLetraY();
        listaVehiculo.vehiculosOrdenadosPorPrecioDescendente();
        listaVehiculo.ordenadosDeFormaNatural();
    }
}
