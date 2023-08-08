package org.example.Utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

    public Boolean validarRegExp(String cadena,String regExp){
        Pattern patron = Pattern.compile(regExp);
        Matcher matcher = patron.matcher(cadena);
        return matcher.matches() ? true : false;
    }

    public Boolean validarFormatoFecha(String fecha){
        Pattern patron = Pattern.compile("^[0-9][0-9]+/[0-9][0-9]+/[2][0][2][3-9]$");
        Matcher matcher = patron.matcher(fecha);
        return matcher.matches();
    }
}
