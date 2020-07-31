import java.util.*;

class Program5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");//taking input
		int x = sc.nextInt();

		if(x == 0)//checking condition for 0
			System.out.println("Entered number is equal to zero");

		else if(x > 0)//checking condition for greater nos
			System.out.println("Entered number is greater than zero");

		else // if number is less than zero
			System.out.println("Entered number is less than zero");

	}



}








