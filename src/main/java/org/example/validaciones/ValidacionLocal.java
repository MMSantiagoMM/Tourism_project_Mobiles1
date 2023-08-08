package org.example.validaciones;

import org.example.Utilidades.DigitosNit;
import org.example.Utilidades.CantidadLetras;

public class ValidacionLocal {
    DigitosNit digitos = new DigitosNit();
    CantidadLetras cantidadLetras = new CantidadLetras();

    public Boolean validarNit(String nit) throws Exception{
        if(!digitos.digitosExactos(nit)){
            throw new Exception("El nit debe tener 10 dígitos");
        }else{
            return true;
        }
    }

    public Boolean validarNombreEmpresa(String nombre) throws Exception{
        if(!cantidadLetras.validarMaxLetras(nombre,31)){
            throw new Exception("El nombre de la empresa no debe sobrepasar lso 30 caracteres");
        }else{
            return true;
        }


    }

}
