import java.util.*;

class Program3{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String st = sc.next();

		if(st.length()>5)
			System.out.println("The string is: " + st);

		else
			System.out.println("The string length is less than 5");

		

	}

}


