package guviprgm;
import java.util.Scanner;
	 
	public class ReverseString {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter input: ");
	        String input = scanner.nextLine();
	        String reverse = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            char ch = input.charAt(i);
	            reverse = reverse + ch;
	        }
	        System.out.println("Reversed String = " + reverse);
	    }
	 
	}
