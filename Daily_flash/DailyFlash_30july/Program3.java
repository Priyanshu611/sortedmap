import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character");//taking input
		String s = sc.nextLine();

		switch(s){ //passing the String in switch

			case "MH" :
				System.out.println("Maharashtra");
				break;

			case "AP" :
				System.out.println("Andhra Pradesh" );
				break;

			case "GJ" :
				System.out.println("Gujrat");
				break;

			case "HP" :
				System.out.println("Himachal Pradesh");
				break;

			case "UP" :
				System.out.println("Uttar Pradesh");
				break;

			default :
				System.out.println("No such case");//default
				break;



		}



	}



}








