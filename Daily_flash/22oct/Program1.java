import java.util.*;

class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");	
		String st = sc.next();

		System.out.println("Entered string is: " + st);	

		System.out.println("Enter a char which you want to replace:");	
		char c1 = sc.next().charAt(0);

		System.out.println("Enter a new char to replace:");
		char c2 = sc.next().charAt(0);

		st = st.replace(c1,c2);

		System.out.println("New string is: " + st);	
		
		

	}


}
