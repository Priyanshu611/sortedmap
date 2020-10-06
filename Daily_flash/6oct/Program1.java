import java.util.*;

class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.println("Enter the number of plane: ");
		int plane = sc.nextInt();

		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter the number of cols: ");
		int cols = sc.nextInt();

		int arr[][][] = new int[plane][rows][cols];
		
		System.out.println("Enter the elements of array: ");

		for(int i = 0; i < plane; i++){

			for(int j = 0; j <rows; j++){

				for(int k = 0; k < cols; k++){

					arr[i][j][k] = sc.nextInt();


				}

			}

		}

		//addition of elements

		for(int i = 0; i < plane; i++){

			for(int j = 0; j <rows; j++){

				for(int k = 0; k < cols; k++){

					sum = sum + arr[i][j][k];


				}

			}

		}


		System.out.println("Sum of the elements of array is: " + sum);

	}

}
