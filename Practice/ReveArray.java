//reverse the array
import java.io.*;

class RevArray {

	//arr[i] = 0;
	
	void Reverse()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the values of array: ");

		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());
		
		}

		int temp[] = new int[size];

		for(int i = 0; i < arr.length; i++){

			temp[i] = arr[size-1];
			size--;

		}

		System.out.println();

		for(int i = 0; i < arr.length; i++){

			System.out.println(temp[i] + " ");


		}
		
	}


}

class Test {

	public static void main(String[] args) throws IOException{		

		RevArray obj = new RevArray();
		obj.Reverse();


	}

}

/*
If we want to reverse in same array

import java.util.*;

class ArrayReverse {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int size;
                System.out.print("Enter the size of array: ");
                size = sc.nextInt();

                int[] arr = new int[size];

                System.out.println("Enter the elements in the array: ");
                for(int i=0;i<arr.length;i++) {

                        arr[i] = sc.nextInt();
                }

                for(int i=0;i<arr.length/2;i++) {

                        int temp = arr[i];
                        arr[i] = arr[arr.length-i-1];
                        arr[arr.length-i-1] = temp;
                }

                System.out.print("\nThe reversed array is: ");
                for(int i=0;i<arr.length;i++) {

                        System.out.print(arr[i]+ " ");
                }
                System.out.println();
        }
}




*/


