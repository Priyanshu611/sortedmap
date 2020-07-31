import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character");//taking input
		char ch = sc.next().charAt(0);

		switch(ch){ //passing the character in switch

			case 'C' :
				System.out.println("C programing");
				break;

			case 'J' :
				System.out.println("Java" );
				break;

			case 'P' :
				System.out.println("Python");
				break;

			case 'S' :
				System.out.println("Swift");
				break;

			case 'G' :
				System.out.println("Go");
				break;

			default :
				System.out.println("No such case");//default
				break;



		}



	}



}








