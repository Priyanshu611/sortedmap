import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter your choice: ");
		System.out.println("1.Integer: ");
		System.out.println("2.String: ");

		int choice = Integer.parseInt(br.readLine());

		switch(choice){

			case 1:
				System.out.print("Enter your Integer: ");
				int num = Integer.parseInt(br.readLine());
				System.out.println("The Integer you entered is:" + num);

				break;

			case 2:
				System.out.print("Enter your String: ");
				String st = br.readLine();
				System.out.println("The String you entered is:" + st);

				break;

			default: 
				System.out.println("No such option");
				break;


		}

	}

}


