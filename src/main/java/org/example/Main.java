package org.example;


import org.example.modelos.Local;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Local local = new Local();
        /*
        System.out.println("Ingrese el nombre del usuario");
        usuario.setNombres(read.nextLine());
        System.out.println(usuario.getNombres());

        System.out.println("Ingrese la direccion");
        usuario.setUbicacion(read.next());
        System.out.println(usuario.getUbicacion());

        System.out.println("Ingrese el correo electrónico");
        usuario.setCorreo(read.next());
        System.out.println(usuario.getCorreo());
*/

        System.out.println("Ingrese el nit del local");
        local.setNit(read.next());
        System.out.println(local.getNit());

        System.out.println("Ingrese el nombre del local");
        local.setNombre(read.next());
        System.out.println(local.getNombre());

    }
}