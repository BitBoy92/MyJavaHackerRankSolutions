import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Read in 6 lines of text from System.in. Each line of text contains six whole
 * numbers which are all between -9 and 9 in value. The goal of the program is
 * to store this input into a 6 x 6 array of ints and output the highest
 * hour glass sum found in the array.
 * <p>
 * An hour glass sum is defined below for a 3 x 3 int array 'a'.
 * a[row, column]
 * a[0,0], a[0,1], a[0,2]
 * a[1,0], a[1,1], a[1,2]
 * a[2,0], a[2,1], a[2,2]
 * hour glass sum = a[0,0] + a[0,1] + a[0,2] + a[1,1] + a[2,0] + a[2,1] + a[2,2]
 * 
 * @author BitBoy
 * @version v1.0 Apr 12, 2017
 */
public class Driver
{
	// CONSTANTS
	// Number of rows in input
	public static final int ROWS = 6;
	// Number of columns in input
	public static final int COLUMNS = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// Initialize Scanner input
		Scanner input = new Scanner(System.in);

		// Initialize int array data
		int data[][] = new int[ROWS][COLUMNS];

		// Populate array data with values from input
		for (int row = 0; row < ROWS; row++)
		{
			for (int col = 0; col < COLUMNS; col++)
			{
				// Set the current address in data to the next int in input
				data[row][col] = input.nextInt();
			}
		}

		// Variable to keep track of the max hour glass sum while we iterate
		// through data. Set to lowest value.
		int maxHourGlassSum = -Integer.MAX_VALUE;

		// Iterate through data searching for the highest hour glass sum. The
		// length is subtracted by 2 because we are looking 2 indices forward in
		// the array.
		for (int row = 0; row < data.length - 2; row++)
		{
			for (int col = 0; col < data[0].length - 2; col++)
			{
				// Calculate the current hour glass sum
				int currentHourGlassSum =
					data[row][col] + data[row][col + 1] + data[row][col + 2]
						+ data[row + 1][col + 1] + data[row + 2][col]
						+ data[row + 2][col + 1] + data[row + 2][col + 2];

				// Compare currentHourGlassSum with maxHourGlassSum
				if (maxHourGlassSum < currentHourGlassSum)
				{
					// Set maxHourGlassSum to currentHourGlassSum
					maxHourGlassSum = currentHourGlassSum;
				}
			}
		}
		
		// Print the maxHourGlassSum
		System.out.println(maxHourGlassSum);
	}
}
