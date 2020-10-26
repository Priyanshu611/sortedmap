import java.util.*;

class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 strings:");	
		String st1 = sc.next();
		String st2 = sc.next();

		if(st1.startsWith(st2))
			System.out.println("Yes");

		else
			System.out.println("NO");	
		
		

	}


}
