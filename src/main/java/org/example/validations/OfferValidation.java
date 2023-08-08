package org.example.validations;

import org.example.utilities.Message;

import java.time.LocalDate;

import static org.example.utilities.MyDate.*;

import static org.example.utilities.RegExp.*;

import static org.example.utilities.Character.*;

public class OfferValidation {

    public static Boolean validateTitle(String offer)throws Exception{
        if(!validateQuantityCharacter(offer,21)){
            throw new Exception(Message.QUANTITY_CHARACTER_FIELD.getMessage());
        }
        return true;
    }

    public static LocalDate validateFormat (String dateB)throws Exception{
        if(!regExpNameGmail(dateB,"^[0-9][0-9]+/[0-9][0-9]+/[0-9][0-9][0-9][0-9]$")){
            throw new Exception(Message.FORMAT_DATES.getMessage());
        }else{
            return changeFormat(dateB);
        }
    }

    public static Boolean validateDatesBeginingAndLast(LocalDate dateOne,LocalDate dateTwo) throws Exception{
        if(dateTwo.isBefore(dateOne)){
            throw new Exception(Message.DATE_VALIDATION.getMessage());
        }
        return true;
    }

    public static Boolean validateCostPerson(Double costPerson) throws Exception{
        if (costPerson < 0){
            throw new Exception(Message.COST_PERSON.getMessage());
        }
        return true;
    }

}
