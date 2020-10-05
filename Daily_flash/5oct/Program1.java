import java.util.*;

class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();

		int arr1[] = new int[row];
		int arr2[] = new int[row];
		int arr3[] = new int[row];

		System.out.println("Enter the elements of 1st array: ");
		for(int i = 0; i < row; i++){

			arr1[i] = sc.nextInt();

		}


		System.out.println("Enter the elements of 2nd array: ");
		for(int i = 0; i < row; i++){

			arr2[i] = sc.nextInt();


		}

		//multipying of array
		for(int i = 0; i < row; i++){

			arr3[i] = arr1[i]*arr2[i];

		}

		System.out.println("Elements of 3rd array are: ");
		for(int i = 0; i < row; i++){

			System.out.println(arr3[i]);

		}


	}
			

}


