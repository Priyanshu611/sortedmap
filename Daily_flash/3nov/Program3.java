import java.io.*;

class Palindrome {

	 void check(int num,int i){

			int rev = 0,rem = 0;
			
			int a = num;

			while(a>0){

				rem = a % 10;

				rev = rev*10+rem;

				a = a/10;

			}

			
			if(rev == num)
				System.out.printf("%d index consists palindrome\n",i);	


		}
		
}



class Program3 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array");		
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the elements of array");

		for(int i = 0; i < size; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
		
		Palindrome obj = new Palindrome();

		for(int i = 0; i < size; i++){

			obj.check(arr[i],i);

			
		}

		

			

	}


}

