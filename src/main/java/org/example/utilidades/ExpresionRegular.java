package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular {

   public static Boolean comprobarExpresionesRegulares(String text,String regExp){
        Pattern patron = Pattern.compile(regExp);
        Matcher validacion = patron.matcher(text);
        return validacion.matches();
    }

    public static Boolean comprobarUbicacionValida(String numero, String regExp){
        Pattern patron = Pattern.compile(regExp);
        Matcher validacion = patron.matcher(numero);
        return validacion.matches();
    }
}
