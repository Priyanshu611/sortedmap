import java.io.*;

class Program5 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		System.out.println("Enter size of both arrays: ");
		int size = Integer.parseInt(br.readLine());

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		System.out.println("Enter elements for 1st array: ");
		for(int i = 0; i < size; i++){

			arr1[i] = Integer.parseInt(br.readLine()); 

		}
	
		for(int i = 0; i < size; i++){

			arr2[i] = 0;

		}

		for(int i = 0; i < size; i++){

			if(arr1[i]%2 == 0)
				arr2[i] = -1;

			else 
				continue;

		}

		System.out.println("Elements of 2nd array is: ");
		for(int i = 0; i < size; i++){

			System.out.println(arr2[i]);

		}
		
	

	}


}


