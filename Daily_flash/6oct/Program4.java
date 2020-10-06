import java.util.*;

class Program4 {

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

		//printing the even nos
		System.out.println("Even nos in the array are: ");
		for(int i = 0; i < plane; i++){

			for(int j = 0; j <rows; j++){

				for(int k = 0; k < cols; k++){

					if(arr[i][j][k]%2 == 0)
						System.out.print(arr[i][j][k] + " ");

				}

			}
		
		}

	}

}
