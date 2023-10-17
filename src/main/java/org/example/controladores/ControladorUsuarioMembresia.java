package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuarioMembresia;
import org.example.servicios.ServicioUsuarioMembresia;

import java.util.List;

public class ControladorUsuarioMembresia {

    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    ServicioUsuarioMembresia servicioUsuarioMembresia = new ServicioUsuarioMembresia();

    public void agregarUsuario(String nombre, String documento,
                                 String correo, String ubicacion, Double cosotMensual,
                                 String cedulaInvitado){



        this.usuarioMembresia.setCedulaInvitado(cedulaInvitado);
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(Integer.valueOf(ubicacion));
        this.usuarioMembresia.setCostoMensual(cosotMensual);


        this.servicioUsuarioMembresia.registrarUsuario(usuarioMembresia);

    }

    public void consultarUsuario(){
        List<ModeloUsuarioMembresia> usuarios = servicioUsuarioMembresia.buscarUsuario();

        for (ModeloUsuarioMembresia modeloUsuarioMembresia:usuarios) {
            System.out.println("Nombre: " + modeloUsuarioMembresia.getFk().getNombres());

        }


    }


}
