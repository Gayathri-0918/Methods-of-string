package methodofstring;

public class Joinstring {

	public static void main(String[] args)// join strings with space between them
	{
		String str1 = "I";
	    String str2 = "love";
	    String str3 = "Java";

	    String joinedStr = String.join(" ", str1, str2, str3);

	    System.out.println(joinedStr);


	}
}
