package org.example.utilities;

public enum Message {
    QUANTITY_LETTER_NAME("The name must not have less of 10 letters"),
    ALERT_EMAIL("Your email is not valid"),
    NOT_NUMBER("Your name must not contain numbers"),
    LOCATION_INVALID("Your location must be between 0 and 4"),
    ONLY_NUMBERS("Please, only number in this field"),
    QUANTITY_NUMBERS_NIT("This field only accept 10 digits"),
    QUANTITY_CHARACTER_FIELD("This field doesn't have required characters");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
