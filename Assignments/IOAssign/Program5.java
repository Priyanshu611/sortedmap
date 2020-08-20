import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.print("Enter Student name: ");
	String s = br.readLine();

	System.out.print("Enter fees paid by Student: ");
	double fees = Double.parseDouble(br.readLine());
	
	System.out.print("Enter Student RollNo: ");
	int roll = Integer.parseInt(br.readLine());

	System.out.print("Student credit points is: ");
	float point = Float.parseFloat(br.readLine());
	
	System.out.print("Enter Student div: ");
	char div = (char)br.read();	

	System.out.println();
	
	System.out.println("Student name is: " + s);		
	System.out.println("Fees paid by Student is: " + fees);
	System.out.println("Student Roll no is: " + roll);
	System.out.println("Student Div is: " + div);
	System.out.println("Student credit point is: " + point);
	

	}

}
