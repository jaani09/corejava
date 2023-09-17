package in.com.batch;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormate {

	public static void main(String[] args) {
	Date date =new Date();
	System.out.println(date);
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	String str=sdf.format(date);
	System.out.println(str);

	}

	}


