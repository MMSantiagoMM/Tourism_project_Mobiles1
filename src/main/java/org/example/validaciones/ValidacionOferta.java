package org.example.validaciones;

import org.example.Utilidades.CantidadLetras;
import org.example.Utilidades.ExpresionesRegulares;
import org.example.Utilidades.Fechas;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

public class ValidacionOferta {
    CantidadLetras cantidadLetras = new CantidadLetras();
    Fechas formFecha = new Fechas();
    ExpresionesRegulares utilRegExp = new ExpresionesRegulares();


    public Boolean validarTituloOferta(String titulo)throws Exception{
        if(!cantidadLetras.validarMaxLetras(titulo,21)){
            throw new Exception("El titulo no puedo sobrepasar los 20 caracteres");
        }else {
            return true;
        }
    }

   public Boolean validarCostoPersona (Double costoPer) throws Exception{
        if(costoPer < 0){
            throw new Exception("El costo no puede ser negativo");
        }else {
            return true;
        }
   }

    public LocalDate validarYConvertirAFecha(String fecha) throws Exception{
        if(!utilRegExp.validarFormatoFecha(fecha)){
            throw new Exception("Ingrese un formato de fecha válido");
        }else {
            return formFecha.convertirStringToLocalDate(fecha);
        }
    }

    public Boolean compararFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if(fechaFin.isBefore(fechaInicio)){
            throw new Exception("La fecha de fin no puede ser anterior a la fecha de inicio");
        }else {
            return true;
        }
    }




}
