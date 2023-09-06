package org.example.validaciones;

import static org.example.utilidades.Mensajes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionLocalTest {

    ValidacionLocal validacionLocal;

    @BeforeEach
    void ajustar_prueba(){
        this.validacionLocal = new ValidacionLocal();
    }

    @Test
    void validar_nit_mas_letras(){
        Exception exception = assertThrows(Exception.class,()->ValidacionLocal.validarNit("12345656789021"));
        assertEquals(CAMPONIT.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_nit_valido(){
        Boolean respuesta = assertDoesNotThrow(()->ValidacionLocal.validarNit("123456789d"));
        assertTrue(respuesta);
    }

    @Test
    void validar_nombre_mas_de_treinta_caracteres(){
        Exception exception = assertThrows(Exception.class,()->ValidacionLocal.validarNombre("poedwpokeopdkewopkdewopdkopewkdpwekdopw"));
        assertEquals(NOMBREEMPRESA.getMensaje(),exception.getMessage());
    }



}