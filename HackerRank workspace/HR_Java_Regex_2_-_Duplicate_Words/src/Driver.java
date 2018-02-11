import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * COPYRIGHT (C) 2017 BitBoy. All Rights Reserved.
 * TODO Class Purpose
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
		String sentence = "cow coW cOwsss hAt haT hat cow";
		sentence = "Goodbye bye bye worLd wORld worLD";
		//sentence = "abcabc"; // will not match abcdef or defabc
		
		Pattern regex = Pattern.compile("(\\b[a-zA-Z]+\\b)(\\s?\\b\\1\\b)+", Pattern.CASE_INSENSITIVE);
		
		Matcher match = regex.matcher(sentence);
		
		//match.matches();

		//System.out.println(match.replaceAll("win "));
		
		//System.out.println(sentence.replaceAll("([a-zA-Z]+\\s)\\1+", "win"));
		
		
		int count = 1;
		while (match.find())
		{
			System.out.println("Count " + count++);
			
			System.out.println(match.groupCount());
			System.out.println("G0 " + match.group(0));
			System.out.println("G1 " + match.group(1));
			System.out.println("Group() " + match.group());
			System.out.println();
		}
		
		

	}
}
