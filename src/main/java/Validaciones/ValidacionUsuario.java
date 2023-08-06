package Validaciones;


import Utilidades.UtilidadRegrex;

public class ValidacionUsuario {
    private UtilidadRegrex util = new UtilidadRegrex();

    public Boolean validarNombre(String nombre) throws Exception {
        if(nombre.length() < 10){
            throw new Exception("Numero de carácteres inválido. El campo debe tener mínimo 10 letras");
        }


        return true;

    }

    public Boolean validarUbicacion(Integer direccion){


        return true;
    }

    public Boolean validarCorreo(String correo) {

        return true;
    }

}
