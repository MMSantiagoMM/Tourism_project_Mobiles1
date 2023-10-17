package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.controladores.ControladorUsuario;
import org.example.entidades.UsuarioInvitado;
import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuario;

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

        controladorUsuario.agregarUsuario("Carlos Moreno","6789",
                "carlos@gmail.com","2",120.000,999);


       /* controladorUsuario.agregarUsuario("Camila Orozco","678910",
                "cami@gmail.com","1",110.000,3);

        controladorUsuario.agregarUsuario("Diomedez Diaz","6666",
                "dio@gmail.com","2",100.000,12);*/



        controladorUsuario.consultarUsuario();

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