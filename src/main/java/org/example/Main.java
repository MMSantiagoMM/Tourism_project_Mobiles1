package org.example;


import org.example.modelos.Reserva;
import org.example.utilidades.Fecha;

public class Main {
    public static void main(String[] args) {

        Reserva reserva = new Reserva();

        reserva.setFechaReserva(Fecha.convertirFecha("23/09/2023"));
        System.out.println(reserva.getFechaReserva());


    }
}