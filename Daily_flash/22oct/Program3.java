import java.util.*;

class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");	
		String st1 = sc.next();

		System.out.println("Enter a char:");	
		char ch = sc.next().charAt(0);
		
		System.out.println("First occurence: " + st1.indexOf(ch));	
		
		System.out.println("Last occurence: " + st1.lastIndexOf(ch));	

	}


}
