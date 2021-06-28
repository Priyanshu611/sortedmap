//write a program to cyclic rotate a array

import java.io.*;

class CyclicArray {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size");
		int size = Integer.parseInt(br.readLine());
		
		
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}

		

		//cyclic rotation of array

		int temp1 = 0,temp = 0;

		for(int i = 0; i < size; i++){

			if(i == 0){

				temp1 = arr[size-1];
				arr[size-1] = arr[i];
				arr[i] = arr[i+1];

			}else if(i >= 1 && i < size-2) {

				temp = arr[i];
				arr[i] = arr[i+1];			

			}else if(i == size-2)
				arr[size-2] = temp1;		

		}

		System.out.println();

		for(int i = 0; i < size; i++){

			System.out.println(arr[i]);

		}

	}

}

/*

/right rotate
		int temp, end;
		end = arr[size-1];
		for(int i=size-1;i>0;i--){
			temp = arr[i];
			arr[i]= arr[i-1];
			arr[i-1] = temp;
		}
		arr[0]=end;
		//


/left rotate
		// int temp,start;
		// start = arr[0];
		// for(int i=0;i<size-1;i++){
			// temp = arr[i];
			// arr[i]= arr[i+1];
			// arr[i+1] = temp;
		// }
		// arr[size-1]=start;
		//

*/
