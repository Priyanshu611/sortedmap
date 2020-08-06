import java.util.*;

class Program5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");//taking input
		int num = sc.nextInt();

		System.out.print("Table of " + num + " is - ");

		for(int i = 1; i <= 10; i++){

			System.out.print(i*num + "  ");//printing table of given num

		}

		System.out.println("  ");

		System.out.print("Even numbers present in the table - ");

		for(int i = 1; i <= 10; i++){

			if(i%2 == 0) //checking even nos

			{
				
				System.out.print(i*num + "  ");//print nos which are divisible by 5
			}

		}

	}

}
