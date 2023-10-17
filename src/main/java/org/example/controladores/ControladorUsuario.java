package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuarioMembresia;
import org.example.servicios.ServicioUsuario;

import java.util.List;

public class ControladorUsuario {

    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    ServicioUsuario servicioUsuario = new ServicioUsuario();

    public void agregarUsuario(String nombre, String documento,
                                 String correo, String ubicacion, Double cosotMensual,
                                 String cedulaInvitado){
        this.usuarioMembresia.setCedulaInvitado(cedulaInvitado);
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(Integer.valueOf(ubicacion));
        this.usuarioMembresia.setCostoMensual(cosotMensual);


        this.servicioUsuario.registrarUsuario(usuarioMembresia);

    }

    public void consultarUsuario(){
        List<ModeloUsuarioMembresia> usuarios = servicioUsuario.buscarUsuario();

        for (ModeloUsuarioMembresia modeloUsuarioMembresia:usuarios) {
            System.out.println("Nombre: " + modeloUsuarioMembresia.getFk().getNombres());

        }


    }


}
