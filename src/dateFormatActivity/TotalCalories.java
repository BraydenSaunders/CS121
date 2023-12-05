package dateFormatActivity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    private DateFormat date = new SimpleDateFormat("MM/dd/yyyy");

    public int dietStats(int calories, String startDate, String endDate){
       int days = 0;
       try {
           Date start = date.parse(startDate);
           Date end = date.parse(endDate);

           long difference = end.getTime() - start.getTime();
           days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
       }
       catch (ParseException e){
           e.printStackTrace();
       }
       return calories * days;
    }
}
