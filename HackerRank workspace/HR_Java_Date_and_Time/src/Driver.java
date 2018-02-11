import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * TODO Calculates what day of the week a particular date falls on.
 *
 * @author BitBoy
 * @version v1.0 Mar 24, 2017
 */
public class Driver
{

	// The Days of the week start at 1 so there is an offset
	public static String[] DAYS_OF_WEEK = { "OFFSET", "SUNDAY", "MONDAY",
		"TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// Receive date from user, ignoring formatting for this problem statement
		Scanner input = new Scanner(System.in);
		// Months are 0 indexed
		int month = input.nextInt() - 1;
		int date = input.nextInt();
		int year = input.nextInt();

		// Extract day of the week from GregorianCalendar obj
		int dayOfWeek =
			new GregorianCalendar(year, month, date).get(Calendar.DAY_OF_WEEK);

		// Depending on the value of day, print appropriate output
		// Disregard values that don't match
		System.out.print(DAYS_OF_WEEK[dayOfWeek]);

	}

}
