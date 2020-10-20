import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 string");

		String str1 = sc.next();
		String str2 = sc.next();

		System.out.println("Entered strings are:");
		System.out.println(str1);
		System.out.println(str2);

		if(str1.contains(str2))
			System.out.println("String 2 is substring of string1");

		else 
			System.out.println("String 2 is not a substring of string1");


	}



}
