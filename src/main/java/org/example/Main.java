package org.example;

import Modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Usuario usuario1 = new Usuario();
        System.out.println("Ingrese el nombre");
        usuario1.setNombres(read.nextLine());

        System.out.println("Escriba el correo");
        usuario1.setCorreo(read.next());
    }
}