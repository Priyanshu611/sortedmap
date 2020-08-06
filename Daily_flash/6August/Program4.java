import java.util.*;

class Program4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");//taking input
		int num = sc.nextInt();

		for(int i = num; i >= 1; i--){

			System.out.print(i + "  ");//printing numbers in desending order

		}

		System.out.println("  ");

		System.out.print("Numbers divisible by 5 are ");

		for(int i = num; i >= 1; i--){

			if(i%5 == 0) //checking divisibilty by 5

			{
				
				System.out.print(i + "  ");//print nos which are divisible by 5
			}

		}

	}

}
