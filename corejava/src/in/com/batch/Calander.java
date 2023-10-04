package in.com.batch;

import java.util.Calendar;
import java.util.Date;

public class Calander<SimpleDateFormate> {



private static int Date;

public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calander.Date,11);
	Date date = cal.getTime()	;
	System.out.println(date);

}
}
SimpleDateFormate sdf = new SimpleDateFormate("dd//MM//yyyy") {



