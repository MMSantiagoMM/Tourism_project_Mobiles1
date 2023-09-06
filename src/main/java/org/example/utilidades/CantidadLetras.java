package org.example.utilidades;

public class CantidadLetras {

    public static Boolean comprobarMinimoLetras(String texto, Integer cantidad){
        return texto.length() >= cantidad;
    }

    public static Boolean comprobarMaximoLetras(String texto, Integer cantidad){
        return texto.length() < cantidad;
    }
}
