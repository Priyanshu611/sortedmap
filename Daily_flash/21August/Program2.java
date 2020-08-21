import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

		float charge,billAmount;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the unit of electricity: ");
		int unit = Integer.parseInt(br.readLine());

		if(unit <= 50){

			charge = 0.50f;
			billAmount = unit*charge;
			System.out.println("Your electricity bill is: " + billAmount);	

		}

		else if(unit >= 50 && unit <= 150){

			charge = 0.75f;
			billAmount = unit*charge;
			System.out.println("Your electricity bill is: " + billAmount);	

		}

		else if(unit >= 150 && unit <= 250){

			charge = 1.20f;
			billAmount = unit*charge;
			System.out.println("Your electricity bill is: " + billAmount);	

		}

		else if(unit >= 250){

			charge = 1.50f;
			billAmount = unit*charge;
			System.out.println("Your electricity bill is: " + billAmount);	

		}


	}

}


