import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

		int sum = 0,num = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brOne = new BufferedReader(isr);
		BufferedReader brTwo = new BufferedReader(isr);

		System.out.print("Enter your name: ");
		String name = brOne.readLine();

		System.out.print("Enter your surname: ");
		String surname = brTwo.readLine();

		
		System.out.println("Entered name is: " + name + " " + surname);

		brOne.close();
		brTwo.close();

	}

}


