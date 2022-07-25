package methodofstring;

import java.util.Arrays;

public class Getbytes {

	public static void main(String[] args) 
	{
		String str = "Gayathri gayu";
	    byte[] byteArray;

	    byteArray = str.getBytes();
	    System.out.println(Arrays.toString(byteArray));

	}

}
