//find the kth max and min element of the array
import java.io.*;

class ArrSorting {

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the size");
	int size = Integer.parseInt(br.readLine());
	
	
	int arr[] = new int[size];

	System.out.println("Enter array elements");
	for(int i = 0; i < size; i++){

		arr[i] = Integer.parseInt(br.readLine());

	}

	for(int i = 0; i < arr.length; i++){

		for(int j = i+1; j < arr.length; j++){
		
			int temp = 0;

			if(arr[i] > arr[j]) {

			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			}
		}

	}
	
	System.out.println("Array elements are");

	for(int i = 0; i < arr.length; i++){

		System.out.println(arr[i]);
	
	}

	System.out.println("Enter the index");
	int index = Integer.parseInt(br.readLine());

	System.out.println(index + " Max is " + arr[size-index]);	
	System.out.println(index + " Min is " + arr[index-1]);	

	}	

}
