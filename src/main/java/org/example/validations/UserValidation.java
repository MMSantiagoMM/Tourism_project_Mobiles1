package org.example.validations;

import org.example.utilities.Message;
import static org.example.utilities.RegExp.*;

public class UserValidation {

    public static Boolean validateName(String name)throws Exception{
        if(name.length() < 10){
            throw new Exception(Message.QUANTITY_LETTER_NAME.getMessage());
        } else if (!regExpNameGmail(name,"^[ a-zA-Z]+$")) {
            throw new Exception(Message.NOT_NUMBER.getMessage());
        }else {
            return true;
        }
    }

    public static Boolean validateLocationUser(Integer location)throws Exception{
        if(location < 1 || location > 4){
            throw new Exception(Message.LOCATION_INVALID.getMessage());
        }
        return true;
    }

    public static Boolean validateEmail(String email)throws Exception{
        if(!regExpNameGmail(email,"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception(Message.ALERT_EMAIL.getMessage());
        }
        return true;
    }

}
