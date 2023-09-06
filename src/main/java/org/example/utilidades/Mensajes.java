package org.example.utilidades;

public enum Mensajes {
    SOLOLETRAS("Este campo solo admite letras"),
    MINIMODIGITOS("Este campo debe contener minimo diez dígitos"),
    SOLONUMEROS("Este campo solo admite números"),
    RANGONUMEROS("Los numeros válidos están en el rango 1 - 4"),
    CORREOVALIDO("El correo electrónico debe ser un correo válido"),
    CAMPONIT("El campo nit solo debe contener diez digitos"),
    NOMBREEMPRESA("El nombre de la empresar no puede sobrepasar los treinta caracteres")
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
