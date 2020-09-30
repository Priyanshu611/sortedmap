import java.io.*;

class Program1 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int[] arr = new int[9];

		arr[0] = 1789;
		arr[1] = 2035;
		arr[2] = 1899;
		arr[3] = 2013;
		arr[4] = 1458;
		arr[5] = 2458;
		arr[6] = 1254;
		arr[7] = 1472;
		arr[8] = 2365;

		System.out.println("Enter a year: ");
		int year = Integer.parseInt(br.readLine());

		for(int i = 0; i < 9; i++){

			if(year == arr[i])
				System.out.println(year+" present in the array");	


		}


	}

}
