import java.io.*;

class Program3 {

	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a character: ");
		char ch = (char)br.read();	

		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Entered character is a Vowel");

		else
			System.out.println("Entered character is a Consonant");
		
	}


}
