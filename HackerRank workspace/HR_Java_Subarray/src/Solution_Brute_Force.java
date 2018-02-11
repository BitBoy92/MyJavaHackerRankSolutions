import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Calculate the quantity of all negative sum subarrays from the given input.
 * <p>
 * Definition: A negative sum subarray is when the sum of elements from a
 * consecutive range of array elements is less than zero. Not that an individual
 * array element may be considered a negative sum if it is negative.
 * <p>
 * This solution uses a brute force method which will be O(n^2). (n/2)(n+1) to
 * be exact.
 * 
 * @author BitBoy
 * @version v1.0 Apr 17, 2017
 */
public class Solution_Brute_Force
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

		// This count will be incremented every time we find a unique negative
		// sum.
		int totalNegSumCount = 0;

		// TEST ALL POSSIBLE SUBARRAY RANGES FOR NEGATIVE SUMS
		// This loop will increment our starting index for a particular subarray
		// range.
		// A[start:end]
		for (int start = 0; start < data.length; start++)
		{
			// This loop will increment our ending index for a particular subarray
			// range. It can never be less than the start index and never more than
			// the number of elements in data.
			// A[start:end]
			for (int end = start; end < data.length; end++)
			{
				// ADD ALL THE ELEMENTS FROM START INCLUSIVE TO END INCLUSIVE TO GET
				// A SUM
				// This integer will store the sum of the current subarray.
				int currentSum = 0;
				// This array increments an index that increments from start to end
				// inclusive.
				for (int i = start; i <= end; i++)
				{
					// Add the value of the index in data to currentSum
					currentSum += data[i];
				}

				// If our currentSum is negative. 
				if (currentSum < 0)
				{
					// Increment negSumCount by one.
					totalNegSumCount++;
				}
			}
		}
		
		// Output totalNegSumCount as result
		System.out.println(totalNegSumCount);
	}
}
