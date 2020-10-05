import java.util.*;

class Program4 {

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
		
		System.out.println("Enter index at which you want to enter the value");
		int index = sc.nextInt();

		System.out.println("Enter the new element");
		int num = sc.nextInt();
		
		for(int i = row-1; i >= (index-1); i--){

			arr1[i+1] = arr1[i];

		}

		arr1[index] = num;

		System.out.println("Elements of array after inserting new element are: ");
		for(int i = 0; i <= row; i++){

			System.out.print(arr1[i] + " ");

		}


		
		
	}
			

}




