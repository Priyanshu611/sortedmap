import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{

	int per;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter your marks of following sublect(out of 100)");

	System.out.print("Physics: ");
	int m1 = Integer.parseInt(br.readLine());

	System.out.print("Chemistry: ");
	int m2 = Integer.parseInt(br.readLine());

	System.out.print("Biology: ");
	int m3 = Integer.parseInt(br.readLine());

	System.out.print("Mathematics: ");
	int m4 = Integer.parseInt(br.readLine());

	System.out.print("Computer: ");
	int m5 = Integer.parseInt(br.readLine());

	per = (m1+m2+m3+m4+m5)/5;
	
	System.out.println("Your percentage is: " + per);	

	switch(per/10){

		case 9:
			System.out.println("Grade: A");
			break;

		case 8:
			System.out.println("Grade: B");
			break;

		case 7:
			System.out.println("Grade: C");
			break;

		case 6:
			System.out.println("Grade: D");
			break;

		case 5:
			System.out.println("Grade: E");
			break;

		case 4:
			System.out.println("Grade: F");
			break;

		default:
			System.out.println("No such case");
			break;


	}


	
		
	}

}
