package org.example;


import org.example.Utilidades.Fechas;
import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Fechas fecha = new Fechas();

        Usuario userOne = new Usuario();
        Local localOne = new Local();
        Oferta ofertaOne = new Oferta();
        /*
        System.out.println("Ingrese el nombre del usuario");
        userOne.setNombres(read.nextLine());
        System.out.println(userOne.getNombres());

        System.out.println("Ingrese la ubicacion");
        userOne.setUbicacion(read.nextInt());
        System.out.println(userOne.getUbicacion());

        System.out.println("Ingrese el correo electrónico");
        userOne.setCorreo(read.next());
        System.out.println(userOne.getCorreo());

        System.out.println("Ingrese el nit del local");
        localOne.setNit(read.next());
        System.out.println(localOne.getNit());

        System.out.println("Ingrese el nombre del local");
        localOne.setNombre(read.next());
        System.out.println(localOne.getNombre());

        System.out.println("Ingrese el titulo de la oferta");
        ofertaOne.setTitulo(read.nextLine());
        System.out.println(ofertaOne.getTitulo());


        System.out.println("Ingrese la fecha de inicio");
        ofertaOne.setFechaInicio(read.next());
        System.out.println(ofertaOne.getFechaInicio());

         */

        System.out.println("Ingrese el costo por persona");
        ofertaOne.setCostoPersona(read.nextDouble());
        System.out.println(ofertaOne.getCostoPersona());

    }
}