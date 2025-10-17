package com.trabajopractico2.concesionriadeautosymotos.ListaVehiculos;

import java.text.NumberFormat;
import java.util.Locale;

public interface IFormateadorDePrecioFormatoArgentino {
   default String formatearPrecio(double precio) {
        NumberFormat formateador = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-AR"));
        return formateador.format(precio);
    }
}
