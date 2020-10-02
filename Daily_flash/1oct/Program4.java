import java.io.*;

class Program4 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  

		int balls = 0,total = 0,six = 0,four = 0, count = 0;

		System.out.println("Enter number of overs: ");
		int over = Integer.parseInt(br.readLine());

		balls = over*6;


		int[] runs = new int[balls];

		System.out.println("Enter runs: ");
		for(int i = 0; i < balls; i++){

			runs[i] = Integer.parseInt(br.readLine()); 

		}
	
		for(int i = 0; i < balls; i++){

			total = total + runs[i];

		}

		for(int i = 0; i < balls; i++){

			if(runs[i]==6)
				six++;

			else if(runs[i]==4)
				four++;

			else if(runs[i]==1||runs[i]==2||runs[i]==3)
				count++;

		}

		System.out.println("Total score is: " + total);
		System.out.println("Total number of balls is: " + balls);
		System.out.println("Total number of sixes is: " + six);
		System.out.println("Total number of fours is: " + four);
		System.out.println("Total number of other run scored is: " + count);
	

	}


}


