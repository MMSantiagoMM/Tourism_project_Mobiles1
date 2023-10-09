package org.example.validacion;


import org.example.utilidades.Mensaje;

import java.time.LocalDate;

import static org.example.utilidades.ExpresionesRegulares.regExp;
import static org.example.utilidades.Fecha.formatearFecha;
import static org.example.utilidades.Mensaje.*;

public class UsuarioMembresiaValidacion {

    public Boolean validarTopePago(Double pago) throws Exception{
        if(pago <= 0 ){
            throw new Exception(TOPENEGATIVO.getMensaje());
        }else if(pago > 100000){
            throw new Exception(TOPEPOSITIVO.getMensaje());
        }
        return true;
    }
}
