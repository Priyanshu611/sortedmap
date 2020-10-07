import java.util.*;

class Program1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][];

		System.out.print("Enter number of columns for row 1: ");
		int col1 = sc.nextInt();

		System.out.print("Enter number of columns for row 2: ");
		int col2 = sc.nextInt();

		System.out.print("Enter number of columns for row 3: ");
		int col3 = sc.nextInt();

		arr[0] = new int[col1];
		arr[1] = new int[col2];
		arr[2] = new int[col3];
		
		System.out.println("Enter the elements: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){


				arr[i][j] = sc.nextInt();

			}

		}

		System.out.println("Elements of array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){


				System.out.print(arr[i][j] + " ");

			}

			System.out.println();		

		}




	}

}
