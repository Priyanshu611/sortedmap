import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.print("Enter Team name: ");
	String s1 = br.readLine();
		
	System.out.print("Enter Captain name: ");
	String s2 = br.readLine();
		
	System.out.print("Enter Best win percentage: ");
	double d = Double.parseDouble(br.readLine());
	
	System.out.print("Enter Number of Indian Batsmen: ");
	int i = Integer.parseInt(br.readLine());

	System.out.print("Enter Number of International Batsmen: ");
	int in = Integer.parseInt(br.readLine());	

	System.out.println();
	
	System.out.println("The IPL team name is: " + s1);		
	System.out.println("Its captain is: " + s2);
	System.out.println("It has best win percentage of: " + d);
	System.out.println("Number of Indian Batsmen are: " + i);
	System.out.println("Enter Number of International Batsmen are: " + in);

	}

}
