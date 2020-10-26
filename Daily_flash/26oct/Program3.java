import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		System.out.println("Enter two strings: ");
		sb.append(sc.next());
		sb1.append(sc.next());


		for(int i = 0; i < sb.length()||i < sb1.length(); i++){

			if(i < sb.length())
				sb2.append(sb.charAt(i));

			if(i < sb1.length())
				sb2.append(sb1.charAt(i));

		}

		System.out.println(sb2);

	}

}
