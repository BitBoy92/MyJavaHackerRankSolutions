import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * Take in text and process it. Processing includes extracting any valid content
 * within tags and printing it out to the console. If a line of text doesn't
 * have any valid tags then "None" is written out to the console.
 * <p>
 * A tag begins with "<abc>" and ends with "<\abc>" where "abc" represents the
 * tag's label. Content between nested tags is considered invalid.
 *
 * @author BitBoy
 * @version v1.0 April 3, 2017
 */
public class Driver
{
	// CONSTANTS
	// Regex used to find data within tags
	public static final String TAG_PARSING_REGEX = "<([^>]+)>([^<]+)</\\1>";

	// The int id of the regex group containing the data of the tags.
	public static final int REGEX_GROUP_TAG_DATA_ID = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Recieve input
		Scanner input = new Scanner(System.in);

		/*
		 * Testing
		 * try
		 * {
		 * input = new Scanner(new File("input02.txt"));
		 * }
		 * catch (Exception e)
		 * {
		 * System.out.println(e.getMessage());
		 * System.exit(-1);
		 * }
		 */

		int testCases = Integer.parseInt(input.nextLine());

		// Init regex pattern to be used in processing lines.
		Pattern regexPat = Pattern.compile(TAG_PARSING_REGEX);

		// Process input one line at a time
		for (int i = 0; i < testCases; i++)
		{
			// Receive text from input obj
			String line = input.nextLine();

			// Create matcher obj with the data in the line String
			Matcher regexMatcher = regexPat.matcher(line);

			// Use this boolean to determine if we return "None" as output for this line
			boolean returnNone = true;
			
			// Look through matches from regexMatcher
			while (regexMatcher.find())
			{
				// Update returnNone value
				if(returnNone)
				{
					returnNone = false;
				}
					
				// Print out Regex group containing tag data
				System.out.println(regexMatcher.group(REGEX_GROUP_TAG_DATA_ID));
			}

			// Print out "None" if flag is true
			if (returnNone)
			{
				System.out.println("None");
			}
		}
	}
}
