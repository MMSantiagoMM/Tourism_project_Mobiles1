package org.example.validaciones;



import static org.example.utilidades.Mensajes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionUsuarioTest {


    @Test
    void validar_nombre_incompleto(){
        Exception exception = assertThrows(Exception.class,()->ValidacionUsuario.validarNombre("Santiago"));
        assertEquals(MINIMODIGITOS.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_nombre_con_numeros_o_caracteresE(){
        Exception exception = assertThrows(Exception.class,()->ValidacionUsuario.validarNombre("Santiago Mosquera12342"));
        assertEquals(SOLOLETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_nombre_valido(){
        Boolean respuesta = assertDoesNotThrow(()->ValidacionUsuario.validarNombre("Santiago Mosquera"));
        assertTrue(respuesta);
    }

    @Test
    void validar_ubicacion_letras(){
        Exception exception = assertThrows(Exception.class,()->ValidacionUsuario.validarUbicacion("d"));
        assertEquals(SOLONUMEROS.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_ubicacion_menor_uno_mayor_cuatro(){
        Exception exception = assertThrows(Exception.class,()->ValidacionUsuario.validarUbicacion("5"));
        assertEquals(RANGONUMEROS.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_ubicacion_valida(){
        Boolean respuesta = assertDoesNotThrow(()->ValidacionUsuario.validarUbicacion("3"));
        assertTrue(respuesta);
    }

    @Test
    void validar_correo_invalido(){
        Exception exception = assertThrows(Exception.class,()->ValidacionUsuario.validarCorreo("malo@gmoi"));
        assertEquals(CORREOVALIDO.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_correo_valido(){
        Boolean respuesta = assertDoesNotThrow(()->ValidacionUsuario.validarCorreo("santiago@gmail.com"));
        assertTrue(respuesta);
    }



}