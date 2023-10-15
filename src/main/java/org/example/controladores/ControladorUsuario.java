package org.example.controladores;

import org.example.entidades.Usuario;
import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuario;
import org.example.servicios.ServicioUsuario;
import org.example.validacion.UsuarioMembresiaValidacion;

public class ControladorUsuario {

    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    ServicioUsuario servicioUsuario = new ServicioUsuario();

    public void registrarUsuario(String nombre, String documento,
                                 String correo, String ubicacion, Double cosotMensual,
                                 Integer idInvitado, Usuario usuario){
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(Integer.valueOf(ubicacion));
        this.usuarioMembresia.setCostoMensual(cosotMensual);
        this.usuarioMembresia.setIdInvitado(idInvitado);
        this.usuarioMembresia.setUsuario(usuario);
        this.servicioUsuario.registrarUsuario(usuarioMembresia);

    }
}
