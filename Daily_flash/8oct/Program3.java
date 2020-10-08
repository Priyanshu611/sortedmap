import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][];
		int sum = 0;

		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[2];

		System.out.println("Enter the elements of the array: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				arr[i][j] = sc.nextInt();

			}

		}


		//sum of the array elements
		
		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				sum = sum + arr[i][j];

			}

		}

		
		

		System.out.println("Elements of the array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				System.out.print(arr[i][j] + "  ");

			}

			System.out.println();

		}

		System.out.println("Sum of the elements of the array is: " + sum);


	}

}
