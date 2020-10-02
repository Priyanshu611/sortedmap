import java.io.*;

class Program3 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int[] arr = new int[5];
		int max = 0;

		System.out.println("Enter elements for array: ");
		for(int i = 0; i < 5; i++){

			arr[i] = Integer.parseInt(br.readLine()); 

		}
	
		System.out.println("Elements of array: ");
		for(int i = 0; i < 5; i++){

			System.out.println(arr[i]);

		}

		
		for(int i = 0; i < 5; i++){

			if(arr[i]>max)
				max = arr[i];

		}
		System.out.println("Greatest value of array is: " + max);

	}


}
