package org.example.validations;

import static org.example.utilities.Character.*;
import org.example.utilities.Message;

import static org.example.utilities.RegExp.*;

public class StablishmentValidation {

    public static Boolean validateNit(String nit) throws Exception{
        if(nit.length() != 10){
            throw new Exception(Message.QUANTITY_NUMBERS_NIT.getMessage());
        }else if(!regExpNameGmail(nit,"^[0-9]+$")){
            throw new Exception(Message.ONLY_NUMBERS.getMessage());
        }
        return true;
    }

    public static Boolean validateName(String name)throws Exception{
        if(!validateQuantityCharacter(name,31)){
            throw new Exception(Message.QUANTITY_CHARACTER_FIELD.getMessage());
        }
        return true;



    }


}
