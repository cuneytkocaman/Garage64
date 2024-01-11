package com.cuneyt.garage64.assistantclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {

    public String currentlyDateTime(String dateTimeFormat){
        DateFormat dateFormat = new SimpleDateFormat(dateTimeFormat); // "dd.MM.yyyy HH:mm:ss"
        Calendar calendar = Calendar.getInstance();

        String dt = dateFormat.format(calendar.getTime());

        return dt;
    }

}
