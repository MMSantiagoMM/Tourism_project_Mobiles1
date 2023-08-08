package org.example.validations;

import org.example.utilities.Message;

import static org.example.utilities.Character.*;

public class OfferValidation {

    public static Boolean validateTitle(String offer)throws Exception{
        if(!validateQuantityCharacter(offer,21)){
            throw new Exception(Message.QUANTITY_CHARACTER_FIELD.getMessage());
        }
        return true;
    }


}
