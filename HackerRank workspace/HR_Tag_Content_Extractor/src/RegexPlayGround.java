import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * TODO Class Purpose
 *
 * @author BitBoy
 * @version v1.0 Apr 3, 2017
 */
public class RegexPlayGround
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String sentence = "<tagName>Bob has a fish named wish.<\\tagName>";
		//sentence = "\\apple";
		//sentence = "<cat>";
		//sentence = "<h1><h2>happy joy<\\h2>pig<\\h1>";
		sentence = "<h1>pig<\\h1><h2>happy joy<\\h2>";
		sentence = "<h1>Nayeem loves counseling</h1>";
		sentence = "<SA premium>Imtiaz has a secret crush</SA premium>";
		sentence = "<j>half off toast123123123</j>kjaksdfj<<<<jahdhkf<calkdk>jksdkfj</calkdk><h1><h1>kjlksd</h1>klsd<cow>afd</cow>";
		
		Pattern regex = Pattern.compile("<([^>]+)>([^<]+)</\\1>"); // note: 4 \'s to match one
																		// in a string. Regex and
																		// java strings see them
																		// both as an escape
																		// character.

		Matcher match = regex.matcher(sentence);

		System.out.println("Sentence is " + sentence);
		System.out.println("Regex is " + regex.pattern());

		while (match.find())
		{
			for(int i = 0; i < match.groupCount() + 1; i++)
			{
				System.out.println("Group: " + i + " = " + match.group(i));
			}
		}

	}
}
