package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.entidades.UsuarioPagoXEvento;
import org.example.modeloDatos.ModeloUsuarioMembresia;
import org.example.modeloDatos.ModeloUsuarioXEvento;
import org.example.servicios.ServicioUsuarioMembresia;
import org.example.servicios.ServicioUsuarioXEvento;

import java.util.List;

public class ControladorUsuarioXEvento {

    UsuarioPagoXEvento usuarioPagoXEvento = new UsuarioPagoXEvento();

    ServicioUsuarioXEvento servicioUsuarioXEvento = new ServicioUsuarioXEvento();

    public void agregarUsuario(String nombre, String documento,
                               String correo, String ubicacion, Double cosotPorEvento){


        this.usuarioPagoXEvento.setNombres(nombre);
        this.usuarioPagoXEvento.setDocumento(documento);
        this.usuarioPagoXEvento.setCorreo(correo);
        this.usuarioPagoXEvento.setUbicacion(Integer.valueOf(ubicacion));
        this.usuarioPagoXEvento.setCostoPorEvento(cosotPorEvento);


        this.servicioUsuarioXEvento.registrarUsuario(usuarioPagoXEvento);

    }

    public void consultarUsuario(){
        List<ModeloUsuarioXEvento> usuarios = servicioUsuarioXEvento.buscarUsuario();

        for (ModeloUsuarioXEvento modeloUsuarioXEvento:usuarios) {
            System.out.println("Nombre: " + modeloUsuarioXEvento.getFk().getNombres());

        }


    }



}
