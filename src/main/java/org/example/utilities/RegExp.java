package org.example.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static Boolean regExpNameGmail(String string, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }


}
