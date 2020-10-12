import java.util.*;

class Program4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s1;
		String s2 = new String();

		System.out.println("Enter 2 strings");
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();

		//s1=s2;
		//System.out.println(s1 + " " + s2);

		s2=s1;
		System.out.println(s1 + " " + s2);
	}

}
