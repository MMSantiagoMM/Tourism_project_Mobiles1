package org.example.validaciones;

import org.example.Utilidades.ExpresionesRegulares;
import org.example.Utilidades.CantidadLetras;

public class ValidacionUsuario {
    CantidadLetras utilNombre = new CantidadLetras();
    ExpresionesRegulares utilRegExp = new ExpresionesRegulares();

    public Boolean validarUsuario(String nombre) throws Exception{
        if(!utilNombre.validarMinLetras(nombre,11)){
            throw new Exception("Cantidad de letras inválido");
        }else if(!utilRegExp.validarRegExp(nombre,"^[ a-zA-Z0-9]+$")){
            throw new Exception("El nombre no debe contener números");
        }else {
            return true;
        }
    }

    public Boolean validarUbicacion(Integer ubicacion)throws Exception{
        if (ubicacion > 4 || ubicacion < 1){
            throw new Exception("El rango de numeros debe estar estre 1 y 4");
        }else {
            return true;
        }
    }

    public Boolean validarCorreo(String correo) throws Exception{
        if(!utilRegExp.validarRegExp(correo,"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception("Ingrese un correo electrónico válido");
        }else {
            return true;
        }

    }



}
