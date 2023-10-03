package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(jsonArray);


    }
}