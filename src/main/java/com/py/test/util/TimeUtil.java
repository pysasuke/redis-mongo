package com.py.test.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by DavidWang on 16/8/11.
 */
public class TimeUtil {

    public static String getCodingDate(){

        String date = null;
        Calendar calendar = new GregorianCalendar();
        String YEAR = String.valueOf(calendar.get(Calendar.YEAR));
        String MONTH = String.format("%02d",calendar.get(Calendar.MONTH) + 1);
        String DAY_OF_MONTH = String.format("%02d",calendar.get(Calendar.DAY_OF_MONTH));

        YEAR = YEAR.substring(YEAR.length() - 2,YEAR.length());
        date = YEAR+MONTH+DAY_OF_MONTH;

        return date;
    }


}
