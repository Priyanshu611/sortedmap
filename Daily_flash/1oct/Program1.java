import java.io.*;

class Program1 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int[] arr = new int[10];

		System.out.println("Enter elements for array: ");
		for(int i = 0; i < 10; i++){

			arr[i] = Integer.parseInt(br.readLine()); 

		}
	
		System.out.println("Reversed elements of array: ");
		for(int i = 0; i < 10; i++){

			System.out.println(arr[9-i]);

		}

	}





}
