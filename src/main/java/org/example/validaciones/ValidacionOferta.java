package org.example.validaciones;

import org.example.Utilidades.CantidadLetras;
import org.example.Utilidades.Fechas;

import java.util.concurrent.ExecutionException;

public class ValidacionOferta {
    CantidadLetras cantidadLetras = new CantidadLetras();
    Fechas formato = new Fechas();

    public Boolean validarTituloOferta(String titulo)throws Exception{
        if(!cantidadLetras.validarMaxLetras(titulo,21)){
            throw new Exception("El titulo no puedo sobrepasar los 20 caracteres");
        }else {
            return true;
        }
    }

    public Boolean compararFechas(String fecha,String fecha2 )throws Exception {
       return true;
    }




}
