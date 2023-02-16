package Java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This will display the date and time in the format of 12/09/2017 24:12:35. See
		 * the complete program below
		 */

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy a HH:mm:ss zzz");
		// get current date time with Date()
		Date date = new Date();
		// Now format the date
		String date1 = dateFormat.format(date);
		// Print the Date
		System.out.println("Current date and time is " + date1);
		
	}

}
