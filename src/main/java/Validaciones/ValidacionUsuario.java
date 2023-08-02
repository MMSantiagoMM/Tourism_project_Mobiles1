package Validaciones;


import Utilidades.UtilidadRegrex;

public class ValidacionUsuario {
    private UtilidadRegrex util = new UtilidadRegrex();

    public Boolean validarNombre(String nombre) throws Exception {
        if(!util.funcionRegex(nombre,"^[ a-zA-Z]+$")){
            throw new Exception("Revise su formato de nombre");
        }
        if(nombre.length() <= 11){
            throw new Exception("Numero de caracteres no válido");
        }
        return true;

    }

    public Boolean validarUbicacion(Integer direccion){


        return true;
    }

    public Boolean validarCorreo(String correo) throws Exception{
        if(!util.funcionRegex(correo,"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception("Correo no válido");
        }
        return true;
    }

}
