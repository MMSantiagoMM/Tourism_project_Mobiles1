package org.example.utilidades;

public enum Mensajes {
    SOLOLETRAS("Este campo solo admite letras"),
    MINIMODIGITOS("Este campo debe contener minimo diez dígitos"),
    SOLONUMEROS("Este campo solo admite números"),
    RANGONUMEROS("Los numeros válidos están en el rango 1 - 4"),
    CORREOVALIDO("El correo electrónico debe ser un correo válido"),
    CAMPONIT("El campo nit solo debe contener diez digitos"),
    MAXIMOCARAC("Este campo excedió los carácteres requeridos"),
    FECHAINICIO("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FORMATOFECHA("El formato de fecha no es el indicado"),
    COSTOPERSONA("El costo por persona no puede ser negativo")
    ;

    public String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
