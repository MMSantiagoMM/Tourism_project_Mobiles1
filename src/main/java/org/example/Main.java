package org.example;


import org.example.controladores.ControladorEmpresaCultural;
import org.example.controladores.ControladorEmpresaPrivada;
import org.example.controladores.ControladorUsuarioMembresia;
import org.example.controladores.ControladorUsuarioXEvento;
import org.example.entidades.UsuarioMembresia;
import org.example.menu.Menu;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*

       Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();

        jsonObject.addProperty("Nombre","Santiago");
        jsonObject.addProperty("Apellido","Mapura");
        System.out.println(jsonObject);

        gson.fromJson(jsonObject, JsonObject.class);
        System.out.println(gson);

        jsonArray.add("Russian");
        jsonArray.add("Spanish");
        jsonArray.add("English");

        System.out.println(jsonArray);*/



/*

        ControladorUsuarioXEvento controladorUsuarioXEvento = new ControladorUsuarioXEvento();

        controladorUsuarioXEvento.agregarUsuario("Carmensa Orozco","23456",
              "carmencita@gmail.com","4",100.000);

        controladorUsuarioXEvento.consultarUsuario();


        ControladorEmpresaCultural controladorEmpresaCultural = new ControladorEmpresaCultural();

        controladorEmpresaCultural.agregarEmpresa(
                "1234456678","LeroLero","4","Empreds",
                "Secretaria","santaigo@gmail.com",
                "3122341925","Nuestra"
        );

        controladorEmpresaCultural.consultarEmpresa();



        ControladorEmpresaPrivada controladorEmpresaPrivada = new ControladorEmpresaPrivada();

        controladorEmpresaPrivada.agregarEmpresa("0123456789","Neuralink","3",
                "esta es una empresa privada","Elon Musk","123456");

        controladorEmpresaPrivada.consultarEmpresa();

        ControladorUsuarioMembresia controladorUsuarioMembresia = new ControladorUsuarioMembresia();

        controladorUsuarioMembresia.agregarUsuario("SJuan David Gonzalez","110012",
                "juandavid@gmail.com","2",120.000,"9999");
        controladorUsuarioMembresia.agregarUsuario("Jimena Orozco","110012",
                "jimena@gmail.com","2",120.000,"");


        controladorUsuarioMembresia.consultarUsuario();



        /*
        * 1.Registrar usuario membresia
        * 2. Registrar usuario por evento
        * 3. Ver usuario membresia
        * 4. ver usuario por evento
        * 5. registrar empresa cultura
        * 6. registrar empresa privada
        * 7. ver empresa cultural
        * 8. ver empresa privada*/
        Menu.menu();



    }
}