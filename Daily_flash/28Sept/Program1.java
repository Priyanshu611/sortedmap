import java.io.*;

class Program1 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.print("Enter name: ");
			String name = br.readLine();
			System.out.print("Enter roll no.: ");
			int rno = Integer.parseInt(br.readLine());
			System.out.print("Enter field of interset: ");
			String field = br.readLine();

		
			System.out.printf("Hey, my name is %s and my roll no is %d.My field of interest is %s\n",name,rno,field);


		
	}

}


