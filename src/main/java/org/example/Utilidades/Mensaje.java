package org.example.Utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("Revise el  formato del nombre ingresado"),
    LONGITUD_NOMBRE("Revise la longitud del nombre, esta es muy corta");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
