package br.com.etechoracio.etec_boaviagem.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    /*private static String FormatDate (int dia, int mes, int ano){
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano,mes,dia);
        return DATE_FORMAT.format(calendar.getTime());
    }*/

    public static String formatDate(int dia, int mes, int ano) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.set(ano, mes, dia);
            return DATE_FORMAT.format(cal.getTime());
        } catch (Exception e){
            return null;
        }
    }

    public static Date toDate(String date){
        try{
            return DATE_FORMAT.parse(date);
        }
        catch (ParseException e)
        {
            return null;
        }
    }
}
