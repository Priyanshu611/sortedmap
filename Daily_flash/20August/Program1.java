import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter the sides if a triangle");

	System.out.print("Side1 = ");
	int s1 = Integer.parseInt(br.readLine());

	System.out.print("Side2 = ");
	int s2 = Integer.parseInt(br.readLine());

	System.out.print("Hypotenuse = ");
	int hyp = Integer.parseInt(br.readLine());

	if((hyp*hyp)==(s1*s1)+(s2*s2))
		System.out.println("Triangle satisfies the Pythagorean theoram");

	else
		System.out.println("Triangle does not satisfies the Pythagorean theoram");
		
	}

}
