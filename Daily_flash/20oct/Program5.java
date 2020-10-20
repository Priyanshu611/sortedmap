import java.util.*;

class Program5{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a password");

		String st = sc.next();
		
		System.out.println("Entered password is:");
		System.out.println(st);
		
		char var;
		int count1 = 0,count2 = 0;

		for(int i = 0; i < st.length(); i++){

			if(st.length() >= 8){

				var = st.charAt(i);

				if((var>=33&&var<=47)||(var>=58&&var<=96))
					count1++;

				else if(var>=48&&var<=57)
					count2++; 

			} else
				break;


		}


		if(count1 >= 1 && count2 >= 1)
			System.out.println("VALID PASSWORD");

		else
			System.out.println("INVALID PASSWORD");

		

	}


}


