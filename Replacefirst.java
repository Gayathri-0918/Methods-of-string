package methodofstring;

public class Replacefirst {

	public static void main(String[] args)
	{
		String str1 = "aabbaaac";
	      String str2 = "Learn223Java55@";

	      String regex = "\\d+";// regex for sequence of digits

	      System.out.println(str1.replaceFirst("aa", "zz")); 

	      System.out.println(str2.replaceFirst(regex, " ")); 
	

	}

}
