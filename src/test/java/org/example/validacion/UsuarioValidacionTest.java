package org.example.validacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //Preparando pruebaas

    UsuarioValidacion usuarioValidacion;


    @BeforeEach
    public void configurarPruebs (){
        System.out.println("Estoy ejecutando la pruba");
        this.usuarioValidacion = new UsuarioValidacion();
    }
    @Test
    public void validarNombrePorFallaNombreCorto(){}
    @Test
    public void validarNombrePorFallaPorNumerosEnNombre(){}
    @Test
    public void validarNombreCorrecto(){}
}