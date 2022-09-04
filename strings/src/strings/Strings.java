package strings;

/**
 * 
 * @author Meisya Puteri Ghefira
 * 
 */

import java.util.Scanner;

public class Strings {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		input.close();
		
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		System.out.println(A.substring(0,2).toUpperCase() + A.substring(2) + " " + 
		B.substring(0, 1).toUpperCase() + B.substring(1));
	}
}
