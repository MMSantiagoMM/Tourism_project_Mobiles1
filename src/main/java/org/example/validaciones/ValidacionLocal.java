package org.example.validaciones;

import org.example.utilidades.CantidadLetras;
import static org.example.utilidades.CantidadLetras.*;

import static org.example.utilidades.Mensajes.*;

public class ValidacionLocal {

    public static Boolean validarNit(String nit) throws Exception{
        if(nit.length()==10){
            return true;
        }else{
            throw new Exception(CAMPONIT.getMensaje());
        }
    }

    public static Boolean validarNombre(String nombre) throws Exception{
        if(!comprobarMaximoLetras(nombre,30)){
            throw new Exception(NOMBREEMPRESA.getMensaje());
        }
        return true;
    }
}
