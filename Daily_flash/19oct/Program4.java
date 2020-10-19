import java.util.*;

class Program4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array element:");
		for(int i = 0; i < size; i++){

			arr[i] = sc.nextInt();

		}

		System.out.println("Array is:");
		for(int i = 0; i < size; i++){

			System.out.println(arr[i]);

		}

		System.out.println("Enter the element who's index you want to search:");
		int ele = sc.nextInt();

		for(int i = 0; i < size; i++){

			if(arr[i]==ele)	
				System.out.println("Index of " + ele + " is " + i);

		}


		
		
	}

}
