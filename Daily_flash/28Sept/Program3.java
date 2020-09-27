import java.io.*;

class Program3 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.print("Enter string ID: ");
			String id1 = br.readLine();
		
			System.out.print("Enter numerical ID: ");
			int id2 = Integer.parseInt(br.readLine());

		
			System.out.printf("Your mail id is: %s%d@gmail.com\n",id1,id2);


		
	}

}


