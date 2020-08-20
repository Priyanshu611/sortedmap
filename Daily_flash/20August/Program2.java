import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

	int r = 3, SI; //rate of interest

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.print("Enter the principle amount ");
	int p = Integer.parseInt(br.readLine());

	System.out.print("Enter the tenure(in months) ");
	int t = Integer.parseInt(br.readLine());

	SI = (p*r*t)/100;//SI calculation

		System.out.println("The Simple Interest is: " + SI);
		
	}

}
