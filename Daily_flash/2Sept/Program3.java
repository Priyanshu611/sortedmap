import java.io.*;

class Program3 {	
	
	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Distance: ");
		int dist = Integer.parseInt(br.readLine());
		System.out.print("Time: ");
		int time = Integer.parseInt(br.readLine());

		int velo = dist / time;

		System.out.printf("The velocity of a particular object roaming in space is: %d m/s\n",velo);

	}

}

