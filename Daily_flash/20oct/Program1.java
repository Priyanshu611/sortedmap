import java.util.*;

class  Program1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");

		String st = sc.next();

		char var;
		int count = 0;

		for(int i = 0; i < st.length(); i++){

			var = st.charAt(i);

			if(var=='A'||var=='E'||var=='I'||var=='O'||var=='U')
				count++;

			else if(var=='a'||var=='e'||var=='i'||var=='o'||var=='u')
				count++; 


		}

		System.out.println("Count of vowels in the string is: " + count);

	}



}
