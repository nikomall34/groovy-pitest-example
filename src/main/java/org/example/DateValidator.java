package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateValidator {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public boolean isValidDateFormat(String date, String format) {
        SimpleDateFormat customFormat = new SimpleDateFormat(format);
        customFormat.setLenient(false);

        try {
            customFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
