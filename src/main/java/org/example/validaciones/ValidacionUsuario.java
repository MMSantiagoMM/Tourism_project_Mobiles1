package org.example.validaciones;

import static org.example.utilidades.CantidadLetras.*;

import static org.example.utilidades.ExpresionRegular.*;
import static org.example.utilidades.Mensajes.*;



public class ValidacionUsuario {

    public static Boolean validarNombre(String nombre) throws Exception{
        if(!comprobarExpresionesRegulares(nombre,"^[ a-zA-Z]+$")){
            throw new Exception(SOLOLETRAS.getMensaje());
        } else if (!comprobarMinimoLetras(nombre,10)) {
            throw new Exception(MINIMODIGITOS.getMensaje());
        }
        return true;
    }

    public static Boolean validarUbicacion(String ubicacion) throws Exception {
        if (!comprobarUbicacionValida(ubicacion, "^[0-9]+$")) {
            throw new Exception(SOLONUMEROS.getMensaje());
        } else if (Integer.valueOf(ubicacion) < 1 || Integer.valueOf(ubicacion) > 4) {
            throw new Exception(RANGONUMEROS.getMensaje());
        }
        return true;
    }


    public static Boolean validarCorreo(String correo) throws Exception{
        if(!comprobarExpresionesRegulares(correo,"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception(CORREOVALIDO.getMensaje());
        }
        return true;
    }



}
