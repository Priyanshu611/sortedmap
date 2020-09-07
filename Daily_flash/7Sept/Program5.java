import java.io.*;

class Program5{

	public static void main(String[] args) throws IOException{

		int add1,add2;		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter number 1: ");
		System.out.print("Real part: ");
		int r1 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary part: ");
		int im1 = Integer.parseInt(br.readLine());

		System.out.println("Enter number 2: ");
		System.out.print("Real part: ");
		int r2 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary part: ");
		int im2 = Integer.parseInt(br.readLine());

		add1 = r1+r2;	
		add2 = im1+im2;
				
		System.out.printf("The Addition of %d+%di & %d+%di is %d+%di\n",r1,im1,r2,im2,add1,add2);


	}

}
