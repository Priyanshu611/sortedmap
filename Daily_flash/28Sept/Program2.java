import java.io.*;

class Program2 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.print("Enter string1: ");
			String string1 = br.readLine();
		
			System.out.print("Enter string2: ");
			String string2 = br.readLine();

		
			System.out.printf("Result: %s %s\n",string1,string2);


		
	}

}


