import java.util.Scanner;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Given input "word(String) \n beginIndex(Integer) endIndex(Integer)", print
 * out the substring of word with beginning index of beginIndex and ending index
 * of endIndex.
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
		// Receive input. One string, next line two space separated integers.
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int beginIndex = input.nextInt();
		int endIndex = input.nextInt();
		input.close();

		// Print substring of word using beginIndex and endIndex.
		System.out.println(word.substring(beginIndex, endIndex));
	}
}
