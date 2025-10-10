package com.trabajopractico2.concesionriadeautosymotos.ListaVehiculos;

public interface IApiStream {
    //Interface con los metodos a implementar en ListaVehiculo
    /**
     * Imprime en consola la lista de vehiculos
     */
    void imprimirVehiculos();
    /**
     * Imprime en consola el vehiculo mas caro
     */
    void vehiculoMasCaro();
    /**
     * Imprime en consola el vehiculo mas barato
     */
    void vehiculoMasBarato();
    /**
     * Imprime en consola los vehiculos que contienen la letra "Y" en su modelo
     */
    void vehiculoConLetraY();
    /**
     * Imprime en consola los vehiculos ordenados por precio de forma descendente
     */
    void vehiculosOrdenadosPorPrecioDescendente();
    /**
     * Imprime en consola los vehiculos ordenados de forma natural (por marca, modelo y precio)
     */
    void ordenadosDeFormaNatural();
}
