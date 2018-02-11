import java.math.BigInteger;
import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Use Java's BigInteger class to determine whether or not a number is prime.
 *
 * @author BitBoy
 * @version v1.0 Apr 10, 2017
 */
public class Driver
{

	// 75% probability equals 2. 1 - (1/2^(c)) = probability
	public static final int PRIME_CERTAINTY = 2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Receive input
		Scanner input = new Scanner(System.in);
		
		// Create a BigInteger based the next value from input
		BigInteger possiblePrimeNum = new BigInteger(input.next());
		
		// Print whether or not the possiblePrimeNum is considered prime.
		if(possiblePrimeNum.isProbablePrime(PRIME_CERTAINTY))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
