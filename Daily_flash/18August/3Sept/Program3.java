import java.io.*;

class Program3 {	

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter current: ");
		int i = Integer.parseInt(br.readLine());
		System.out.print("Enter resistance: ");
		int r = Integer.parseInt(br.readLine());

		int v;
		
		v = i* r;

		System.out.printf("Voltage V = %d\n",v);	

	}
	
}
