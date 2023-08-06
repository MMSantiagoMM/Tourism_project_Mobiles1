package org.example;


import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        Usuario userOne = new Usuario();

        System.out.println("Ingrese el nombre del usuario");
        userOne.setNombres(read.nextLine());
        System.out.println(userOne.getNombres());

        System.out.println("Ingrese la ubicacion");
        userOne.setUbicacion(read.nextInt());
        System.out.println(userOne.getUbicacion());

        System.out.println("Ingrese el correo electrónico");
        userOne.setCorreo(read.next());
        System.out.println(userOne.getCorreo());


    }
}