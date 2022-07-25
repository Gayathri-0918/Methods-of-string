package methodofstring;

public class Replaceall {

	public static void main(String[] args) 
	{
		 String str1 = "Java123is456fun";

		    String regex = "\\d+"; // regex for sequence of digits

		    System.out.println(str1.replaceAll(regex, " "));// replace all occurrences of numeric
		                                                    // digits by a space


		  }
	

	}


