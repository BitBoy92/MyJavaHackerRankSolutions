import java.math.BigInteger;
import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Take in two large integers A and B and output A + B and A * B.
 *
 * @author BitBoy
 * @version v1.0 Apr 4, 2017
 */
public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Setup input
		Scanner input = new Scanner(System.in);
		
		// Init BigInteger vars with data from input
		BigInteger firstInteger = new BigInteger(input.nextLine().trim());
		BigInteger secondInteger = new BigInteger(input.nextLine().trim());

		// Print out firstInteger + secondInteger
		System.out.println(firstInteger.add(secondInteger));
	
		// Print out firstInteger * secondInteger
		System.out.println(firstInteger.multiply(secondInteger));
	}
}
