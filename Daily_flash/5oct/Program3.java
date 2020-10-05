import java.util.*;

class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter number of cols: ");
		int col = sc.nextInt();

		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int arr3[][] = new int[row][col];

		int mul = 1, sumE = 0, max =0;

		System.out.println("Enter the elements of 1st array: ");
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){
			
				arr1[i][j] = sc.nextInt();

			}

		}

		System.out.println("Enter the elements of 2nd array: ");
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){
			
				arr2[i][j] = sc.nextInt();

			}

		}

		//operation of array
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){

				arr3[i][j] = arr1[i][j]+arr2[i][j];
					
			}		

		}

		System.out.println("Elements of 3rd array are: ");
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){
			
				System.out.print(arr3[i][j] + " ");

			}

			System.out.println();

		}	
		
	}
			

}




