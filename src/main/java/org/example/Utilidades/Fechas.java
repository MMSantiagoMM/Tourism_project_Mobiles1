package org.example.Utilidades;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {

    public LocalDate convertirFechas(String fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocalDate = LocalDate.parse(fecha,formatter);
        return fechaLocalDate;
    }



}
