import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Calculate the quantity of all negative sum subarrays from the given input.
 * <p>
 * Definition: A negative sum subarray is when the sum of elements from a
 * consecutive range of array elements is less than zero. Not that an individual
 * array element may be considered a negative sum if it is negative.
 * <p>
 * This solution uses the idea of negative sum subarrays as cells which can grow
 * in accordance with rules to form new negative sum subarrays.
 * 
 * @author BitBoy
 * @version v1.0 Apr 17, 2017
 */
public class Solution_Cell_Growth
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// PROCESS INPUT
		// Create an scanner object that we can access to receive input
		Scanner input = new Scanner(System.in);

		// First item from input will be the integer number of elements in the
		// array
		int inputArraySize = input.nextInt();

		// Create our array to store subsequent data from input
		int[] data = new int[inputArraySize];

		// Read the data from input and store it in the data array
		for (int i = 0; i < inputArraySize; i++)
		{
			data[i] = input.nextInt();
		}

		// We are done using the input scanner, so clean it up.
		input.close();

		// CELL GROWTH SOLUTION
		// Loop through the indices in data
		for (int i = 0; i < data.length; i++)
		{
			// Does this index in data contain a negative value?
			if (data[i] < 0)
			{

			}
		}

	}

}
