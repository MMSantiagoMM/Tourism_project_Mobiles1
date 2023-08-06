package org.example.Utilidades;

public class MinimoLetras {
    public Boolean validarMinLetras(String cadena,Integer cantidad){
        return cadena.length() < cantidad ? false : true;
    }



}
