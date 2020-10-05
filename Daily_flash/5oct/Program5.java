import java.util.*;

class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();

		int arr1[] = new int[row+1];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < row; i++){

			arr1[i] = sc.nextInt();

		}

		System.out.println("Elements of array are: ");
		for(int i = 0; i < row; i++){

			System.out.print(arr1[i] + " ");

		}

		System.out.println();
		
		System.out.println("Reversed array is");
		
		for(int i = row-1; i >= 0; i--){

			System.out.print(arr1[i] + " ");

		}

		
		
		
	}
			

}




