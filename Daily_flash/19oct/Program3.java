import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array element:");
		for(int i = 0; i < size; i++){

			arr[i] = sc.nextInt();

		}

		int sum = 0;

		System.out.println("Array is:");
		for(int i = 0; i < size; i++){

			System.out.println(arr[i]);

			sum = sum + arr[i];

		}

		

		System.out.println("Sum of array elements is: " + sum);
		
		
	}

}
