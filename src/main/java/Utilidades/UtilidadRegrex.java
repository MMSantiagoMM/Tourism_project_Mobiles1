package Utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilidadRegrex {
    public Boolean funcionRegex(String cadena, String regex){
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(cadena);
        return coincidencia.matches()?true:false;
    }


}
