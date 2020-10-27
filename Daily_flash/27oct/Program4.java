import java.util.*;

class Program4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();

		System.out.println("Enter a string:");
		sb.append(sc.nextLine());

		char ch;

		for(int i = 0; i < sb.length(); i++){

			ch = sb.charAt(i);

			if(ch!=' ')			
				sb1.append(ch);

		}
		System.out.println("String is: "+ sb1);
		


	}

}
