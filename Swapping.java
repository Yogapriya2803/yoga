import java.util.*;
	import java.io.*; 
public class Swapping {

	
	   public static String swapPairs(String s) {
	    String even = "";
	    String odd = "";
	    int length = s.length();

	    for (int i = 0; i <= length-2; i+=2) {          
	        even += s.charAt(i+1) + "" + s.charAt(i);
	    }

	    if (length % 2 != 0) {          
	        odd = even + s.charAt(length-1);
	        return odd;
	    } else {
	        return even;
	    }
	}
	public static void main(String[] args)
	{
	Swapping sw= new Swapeven();
	System.out.println("given string 'computer' ");
	System.out.println(sw.swapPairs("computer"));

	}
	
}
