import java.util.*;

class Program4 {

	public static void main(String[] args){

		System.out.println("Enter a number");

		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
	

		for(int i = 1; i <= num; i++){//fro loop for incrementing nos

			int fact = 1;	
			
			for(int j = 1; j<=i; j++){//for loop for calculating factorial

				fact = fact*j;//calculating factorial

			}

				System.out.println("Factorial of " + i + " is " + fact);

		}


	}

}
