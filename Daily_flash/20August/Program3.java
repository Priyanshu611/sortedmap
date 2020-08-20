import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);


	System.out.print("Enter a year ");
	int year = Integer.parseInt(br.readLine());

	if(year%4 == 0)
		System.out.println("Entered year is a leap year");

	else if(year%400 == 0)
		System.out.println("Entered year is a leap year");

	else
		System.out.println("Entered year is not a leap year");
		
	}

}
