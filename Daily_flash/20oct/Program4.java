import java.util.*;

class Program4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");

		String str1 = sc.next();
		
		System.out.println("Entered string is:");
		System.out.println(str1);
		

		String rev = "";

		int length = str1.length();

		for(int i = length-1; i>= 0; i--){

			rev = rev + str1.charAt(i);

		}

		if(str1.equals(rev))
			System.out.println("Entered string is a palindrome");

		else 
			System.out.println("Entered string is not a palindrome");


	}



}
