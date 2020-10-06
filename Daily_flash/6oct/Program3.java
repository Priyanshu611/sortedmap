import java.util.*;

class Program3 {

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

		//printing the matrix
		System.out.println("Printing the first plane");
		for(int i = 0; i < plane; i++){

			if(i == 1)
				System.out.println("Printing the 2nd plane");

			for(int j = 0; j <rows; j++){

				for(int k = 0; k < cols; k++){

					System.out.print(arr[i][j][k] + " ");

					if(i == 0)
						sum = sum + arr[i][j][k];

				}

				System.out.println();

			}

			System.out.println();

		}

		System.out.println("Sum of the 1st plane is: " + sum);

	}

}
