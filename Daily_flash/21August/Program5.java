import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.print("Enter a character: ");
		char ch = (char)br.read();
		int ch1 = ch;

		System.out.printf("ASCII value of %c is: %d",ch,ch1);
		System.out.println();

	}

}

