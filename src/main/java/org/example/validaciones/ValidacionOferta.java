package org.example.validaciones;

import static org.example.utilidades.ExpresionRegular.*;

import java.time.LocalDate;

import static org.example.utilidades.Mensajes.*;

import static org.example.utilidades.CantidadLetras.*;

public class ValidacionOferta {
    Boolean validarTitulo(String titulo) throws Exception{
        if(!comprobarMaximoLetras(titulo,20)){
            throw new Exception(MAXIMOCARAC.getMensaje());
        }
        return true;
    }

    Boolean validarTiemposFechas(LocalDate fecha1, LocalDate fecha2) throws Exception{
        if(fecha1.isAfter(fecha2)){
            throw new Exception(FECHAINICIO.getMensaje());
        }
        return true;
    }

    Boolean validarFormatoFecha(String fecha) throws Exception{
        if(!comprobarExpresionesRegulares(fecha,"^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]+$")){
            throw new Exception(FORMATOFECHA.getMensaje());
        }
        return true;
    }

    Boolean validarCostoPersona(Double costo) throws Exception{
        if(costo <= 0){
            throw new Exception(COSTOPERSONA.getMensaje());
        }
        return true;
    }




}
