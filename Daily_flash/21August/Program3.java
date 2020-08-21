import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter age: ");
		int age = Integer.parseInt(br.readLine());

		System.out.print("Enter sex(Female or Male): ");
		String s = br.readLine();
	
		System.out.print("Are you married(Y or N): ");
		char m = (char)br.read();

		switch(s){

			case "Female":

				System.out.println("You will work in urban area only: ");
				break;

			

			case "Male":{

				if(age >=20 && age <= 40)
					System.out.println("You may work anywhere: ");

				else if(age >=40 && age <= 60)
					System.out.println("You will work in urban area only: ");

				else
					System.err.println("Error");

				}

				break;

			default:

					System.out.println("No such option");
					break;
			

		}

	}

}

