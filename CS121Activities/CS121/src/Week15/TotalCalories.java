package Week15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TotalCalories {
    int totalCalaories;
    long days, diff;

    public TotalCalories(int calories, String startDate, String endDate) throws ParseException {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date firstDate = simpleDateFormat.parse(startDate);
        Date secondDate = simpleDateFormat.parse(endDate);

        this.diff = Math.abs(secondDate.getTime() - firstDate.getTime());
        this.days = TimeUnit.MILLISECONDS.toDays(diff);
        this.totalCalaories = (int) (calories * days);
    }
    public String getTotalCalories(){
        return String.format("Amount of time on diet(in days): %d\n" + "Amount of total calories consumed across diet time: %d\n", days, totalCalaories);
    }
}
