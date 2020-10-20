import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");

		String st = sc.next();

		char var[] = new char[st.length()];
		int count = 0;

		for(int i = 0; i < st.length(); i++){

			var[i] = st.charAt(i);

			if(var[i] >= 65 && var[i] <= 91){

				var[i]+=32;

			}
				

			else if(var[i] >= 97 && var[i] <= 123){

				var[i]-=32;

			}


		}

		System.out.println("New string is:");
		for(int i = 0; i < var.length; i++){


			System.out.print(var[i]);


		}

		System.out.println();

	}



}
