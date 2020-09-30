import java.io.*;

class Program4 {

	public static void main(String[] args){

		int max = 0;
		int[] arr = new int[5];

		arr[0] = 15;
		arr[1] = 14;
		arr[2] = 18;
		arr[3] = 20;
		arr[4] = 19;
		

		for(int i = 0; i < 5; i++){

			if(arr[i]>max)

				max = arr[i];	


		}	

		for(int i = 0; i < 5; i++){

			if(arr[i]==max)
				System.out.println("Index of max is: " + i);


		}	

		

	}

}



