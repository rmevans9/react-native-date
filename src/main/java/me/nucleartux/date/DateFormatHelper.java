package me.nucleartux.date;

import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormatHelper {
  public static Calendar parseDate(String date) {
    Calendar initialDate = Calendar.getInstance();

    if (date != null && date != "")
    {
      SimpleDateFormat df = new SimpleDateFormat();

      try
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        initialDate.setTime(sdf.parse(date));
      }
      catch (ParseException e)
      {
        return Calendar.getInstance();
      }
    }

    return initialDate;
  }
}
