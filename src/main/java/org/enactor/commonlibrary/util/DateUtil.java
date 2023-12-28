package org.enactor.commonlibrary.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil
{
    public static LocalDate convertStringToDate(String date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(date, formatter);
            return localDate;
        } catch (DateTimeParseException e) {
            throw e;
        }
    }


}
