import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Print out input(double precision floating point) in various currency
 * formats.
 *
 * @author BitBoy
 * @version v1.0 Mar 27, 2017
 */
public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Receive input. The amount of currency as a double.
		Scanner input = new Scanner(System.in);
		double payment = input.nextDouble();
		input.close();

		// Print out currency format to specified Locales
		// US Currency
		System.out.println(
			"US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
		// Indian Currency
		System.out.println("India: " + NumberFormat
			.getCurrencyInstance(new Locale("en", "IN")).format(payment));
		// Chinese Currency
		System.out.println("China: "
			+ NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		// French Currency
		System.out.println("France: "
			+ NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
	}
}
