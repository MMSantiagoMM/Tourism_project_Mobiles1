package org.example.Utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

    public Boolean validarRegExp(String cadena,String regExp){
        Pattern patron = Pattern.compile(regExp);
        Matcher matcher = patron.matcher(cadena);
        return matcher.matches() ? true : false;
    }
}
