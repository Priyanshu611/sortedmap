import java.io.*;

class Program2 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int[] arr = new int[10];

		arr[0] = 25;
		arr[1] = 14;
		arr[2] = 56;
		arr[3] = 15;
		arr[4] = 36;
		arr[5] = 56;
		arr[6] = 77;
		arr[7] = 18;
		arr[8] = 29;
		arr[9] = 49;

		System.out.println("Enter the number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i < 10; i++){

			if(num == arr[i])
				System.out.println("Index of " + num + " is " + i);	


		}


	}

}
