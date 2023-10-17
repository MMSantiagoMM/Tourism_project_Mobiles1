package org.example;


import org.example.controladores.ControladorUsuarioMembresia;
import org.example.controladores.ControladorUsuarioXEvento;
import org.example.entidades.UsuarioMembresia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Gson gson = new Gson();
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

        System.out.println(jsonArray);

        UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

        UsuarioInvitado usuarioInvitado = usuarioMembresia.agregarReferido("12345");

        System.out.println(usuarioInvitado.toString());
        */

         Scanner scanner = new Scanner(System.in);

         UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

        ControladorUsuarioMembresia controladorUsuarioMembresia = new ControladorUsuarioMembresia();
        ControladorUsuarioXEvento controladorUsuarioXEvento = new ControladorUsuarioXEvento();

        controladorUsuarioMembresia.agregarUsuario("SJuan David Gonzalez","110012",
                "juandavid@gmail.com","2",120.000,"9999");

        controladorUsuarioXEvento.agregarUsuario("Carmensa Orozco","23456",
                "carmencita@gmail.com","4",100.000);






        controladorUsuarioMembresia.consultarUsuario();
        controladorUsuarioXEvento.consultarUsuario();


        /*
        * 1.Registrar usuario membresia
        * 2. Registrar usuario por evento
        * 3. Ver usuario membresia
        * 4. ver usuario por evento
        * 5. registrar empresa cultura
        * 6. registrar empresa privada
        * 7. ver empresa cultural
        * 8. ver empresa privada*/




    }
}