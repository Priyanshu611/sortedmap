import java.util.*;

class Program5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][];

		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];

		System.out.println("Enter the elements of the array: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				arr[i][j] = sc.nextInt();

			}

		}
		

		System.out.println("Elements of the array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				System.out.print(arr[i][j] + "  ");

			}

			System.out.println();

		}

		
		//Array elements divisible by 5
		System.out.println("Nos in the array divisible by 5 are: ");
		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				if(arr[i][j]%5==0)
					System.out.print(arr[i][j] + " ");

			}

		}

		


	}

}
