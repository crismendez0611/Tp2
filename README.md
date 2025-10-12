Trabajo Practico 2  

Concesionaria de autos y motos

Se utiliza Sprin Boot , Interface ,Api Stream,List ,ArrayList ,Comparable.

En el Proyecto esta dividido en 3 paquetes que son:

-listaVehiculos: Esta contiene una Interface  IApi Stream y una clase llamada ListaVehiculo
en IApiStream tiene los nombres de los métodos que va a usar ListaVehiculo que los son los siguientes:
    void vehiculoMasCaro()
    void vehiculoMasBarato()
    void vehiculoConLetraY()
    void vehiculosOrdenadosPorPrecioDescendente()
    void ordenadosDeFormaNatural()
ListaVehiculo: implementa la interface IApiStream donde los metodos fueron sobreescribidos
para poder usar los metodos de ApiStream
su unico atributo es una lista que es de vehiculos y su unico método usa el varargs para poder agregar todos los vehiculos 

-vehiculos:Este paquete contiene la clase padre Vehiculo con los siguientes atributos marca,modelo y precio.
            Tambien contiene las clase hijas de Vehiculo que son Auto y Moto
            Estas mismas cada una tienen los atributos hererados y un atributo unico de ellas que para auto es puerta y para moto cilindrada.
La clase Vehiculo implementa Comparable y fue sobre escrita para poder ordernar la lista de forma natural

-tests:Contiene la clase test con el método main para poder realizar las prueba de todo el sistema
