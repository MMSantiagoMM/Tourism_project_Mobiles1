package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public static LocalDate convertirFecha(String fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate newFormatter = LocalDate.parse(fecha,formatter);
        return newFormatter;
    }

}
