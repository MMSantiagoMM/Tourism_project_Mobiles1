package org.example.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {

    public static LocalDate changeFormat(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate newFormatter = LocalDate.parse(date,formatter);
        return newFormatter;
    }


}
