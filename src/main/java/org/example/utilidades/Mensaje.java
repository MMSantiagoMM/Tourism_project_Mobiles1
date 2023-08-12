package org.example.utilidades;

public enum Mensaje {
    CANTIDADLETRAS("Digite la cantidad de caracteres requidas"),
    CARACTERESNOMBRE("El nombre no puede contener numeros ni caracteres especiales"),
    CARACTERESNUMERO("La ubicacion no puede contener letras"),
    NUMEROSVALIDOS("La direccion debe estar entre los numeros 1 y 4"),
    CARACTERESCORREO("El correo electrónico debe ser un correo válido"),
    CARACTERESNIT("El campo nit debe contener 10 digitos");

    public String mensaje;

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
