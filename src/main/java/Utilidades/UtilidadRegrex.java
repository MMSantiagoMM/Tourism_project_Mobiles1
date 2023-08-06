package Utilidades;


import java.util.regex.Pattern;

public class UtilidadRegrex {
    public Boolean functionRegrex(String campo, String regExp){
        Pattern patron = Pattern.matches(regExp,campo);
    }


}
