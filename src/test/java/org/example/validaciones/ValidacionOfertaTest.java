package org.example.validaciones;

import static org.example.utilidades.Mensajes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionOfertaTest {
    ValidacionOferta validacionOferta;

    @BeforeEach
    public void prepararPrueba(){
        this.validacionOferta = new ValidacionOferta();
    }

    @Test
    void validar_titulo_con_mas_de_veinte_letras(){
        Exception exception = assertThrows(Exception.class,()->validacionOferta.validarTitulo("Este titulo excede la cantidad de letras permitada"));
        assertEquals(MAXIMOCARAC.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_titulo_correcto(){
        Boolean response = assertDoesNotThrow(()->validacionOferta.validarTitulo("Este titulo sirve"));
        assertTrue(response);
    }

    @Test
    void validar_formato_fecha_incorrecta(){
        Exception exception = assertThrows(Exception.class,()->validacionOferta.validarFormatoFecha("2023/06/23"));
        assertEquals(FORMATOFECHA.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_formato_Fecha_valido(){
        Boolean address = assertDoesNotThrow(()->validacionOferta.validarFormatoFecha("23/06/2023"));
        assertTrue(address);
    }

    @Test
    void validar_fecha_incio_superior_a_fecha_fin(){
        LocalDate fecha1 = LocalDate.parse("2023-06-12");
        LocalDate fecha2 = LocalDate.parse("2022-04-12");

        Exception exception = assertThrows(Exception.class,()->validacionOferta.validarTiemposFechas(fecha1,fecha2));
        assertEquals(FECHAINICIO.getMensaje(),exception.getMessage());
    }

    @Test
    void validar_fecha_incio_y_fin_validas(){
        LocalDate fecha1 = LocalDate.parse("2025-07-29");
        LocalDate fecha2 = LocalDate.parse("2025-08-29");

        Boolean response = assertDoesNotThrow(()->validacionOferta.validarTiemposFechas(fecha1,fecha2));
        assertTrue(response);
    }

}