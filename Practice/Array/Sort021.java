//sort 0,1 and 2 from the array without using sorting algo
import java.io.*;
class Sort012 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array: ");

		int size = Integer.parseInt(br.readLine());

		
		int arr[] = new int[size];

		System.out.println("Enter the values of array: ");

		int c1 = 0, c2 = 0, c3 = 0;

		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]==0)	
				c1++;

			else if(arr[i]==1)	
				c2++;

			else if(arr[i]==2)	
				c3++;
		
		
		}

		int j = 0,k;
		for(; j < c1; j++){

			arr[j] = 0;
		
		}

		for(k = j; k < c2+j; k++){

			arr[k] = 1;
		
		}

		for(int i = k; i < c3+k; i++){

			arr[i] = 2;
		
		}
	
	
		System.out.println();
		System.out.println("Sorted Array");

		
		for(int i = 0; i < size; i++){

			System.out.println(arr[i]);

		}


	}



}
