import java.io.*;

class Program5 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int[] arr = new int[10];
		int ecount = 0,pcount = 0,ncount = 0,ocount = 0,count = 0;

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < 10; i++){

			arr[i] =Integer.parseInt(br.readLine());

		}

		for(int i = 0; i < 10; i++){

			if(arr[i]%2==0 && arr[i]!=0)
				ecount++;

			if(arr[i]>0)
				pcount++;
					
			if(arr[i]<0)
				ncount++;

			if(arr[i]==0)
				count++;

			if(arr[i]%2!=0)
				ocount++;


		}

		System.out.println("Count of positive integer is: " + pcount);
		System.out.println("Count of negative integer is: " + ncount);
		System.out.println("Count of odd integer is: " + ocount);
		System.out.println("Count of even integer is: " + ecount);
		System.out.println("Count of 0s is: " + count);

	}

}
