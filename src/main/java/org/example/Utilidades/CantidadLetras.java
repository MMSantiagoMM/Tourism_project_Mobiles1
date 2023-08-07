package org.example.Utilidades;

public class CantidadLetras {
    public Boolean validarMinLetras(String cadena,Integer cantidad){
        return cadena.length() > cantidad ? true : false;
    }

    public Boolean validarMaxLetras(String cadena, Integer cantidad){
        return cadena.length() < cantidad;
    }


}
