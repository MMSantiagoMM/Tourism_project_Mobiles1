package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.controladores.ControladorUsuario;
import org.example.entidades.UsuarioInvitado;
import org.example.entidades.UsuarioMembresia;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
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

        ControladorUsuario controladorUsuario = new ControladorUsuario();

        controladorUsuario.registrarUsuario("Santiago Mosquera","12345","santiago@gmail.com",
                "4",123.000,1,null);






    }
}