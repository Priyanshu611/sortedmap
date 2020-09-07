import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

		float KE;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter mass: ");
		int mass = Integer.parseInt(br.readLine());
		System.out.print("Enter velocity: ");
		int velo = Integer.parseInt(br.readLine());

		KE = (mass*velo*velo)/2;		
				
		System.out.printf("Kinetic Energy of that object is %.1f\n",KE);

	}

}
