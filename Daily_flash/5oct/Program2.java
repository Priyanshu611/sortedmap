import java.util.*;

class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter number of cols: ");
		int col = sc.nextInt();

		int arr1[][] = new int[row][col];

		int mul = 1, sumE = 0, max =0;

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){
			
				arr1[i][j] = sc.nextInt();

			}

		}

		//operation of array
		for(int i = 0; i < row; i++){

			for(int j = 0; j < col; j++){

				if(arr1[i][j]%2 == 0)			
					sumE = sumE + arr1[i][j];

				else{

					if(arr1[i][j]>max)
						max = arr1[i][j];

				}
					

			}		

		}


		mul = sumE*max;

		System.out.println("Sum of Even elements: " + sumE);
		System.out.println("Max Odd elements: " + max);
		System.out.println("Multiplication of even sum and odd sum: " + mul);
		
	}
			

}


