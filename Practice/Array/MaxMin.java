//max and min from the array

import java.io.*;

class MaxMin {

	//arr[i] = 0;
	
	public static void main(String[] args) throws IOException{		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the values of array: ");

		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());
		
		}

		int min = 999, max = 0;

		for(int i = 0; i < arr.length; i++){

			if(arr[i]>max){

				max = arr[i];
			
			
			}

			if(arr[i]<min){

				min = arr[i];

			}

		}

		System.out.println();

		System.out.println(max);

		System.out.println(min);

		
	}

}


