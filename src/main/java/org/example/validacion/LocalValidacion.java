package org.example.validacion;

import static org.example.utilidades.Caracteres.*;

import static org.example.utilidades.ExpresionesRegulares.*;
import org.example.utilidades.Mensaje;

public class LocalValidacion {

    public static Boolean validarNit(String nit)throws Exception{
        if(nit.length() != 10){
            throw new Exception(Mensaje.CARACTERESNIT.getMensaje());
        }
        return true;
    }

    public static Boolean validarNombre(String nombre) throws Exception {
        if (!maximoLetras(nombre, 31)) {
            throw new Exception(Mensaje.CANTIDADLETRAS.getMensaje());
        } else if (regExp(nombre,"^[ a-zA-Z0-9._%+-]$")) {
            throw new Exception();
        }
        return true;


    }




}
