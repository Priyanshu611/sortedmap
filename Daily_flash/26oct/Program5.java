import java.util.*;

class Program5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String sb = new String();
		String sb1 = new String();
		
		System.out.println("Enter a string: ");
		sb = sc.nextLine();

		System.out.println("Enter a sub string: ");
		sb1 = sc.nextLine();

		if(sb.contains(sb1)){			

			int index = sb.lastIndexOf(sb1);
			System.out.println("Last occurence of the substring is: " + index);


		} else {

			System.out.println("Substring is not present");

		}
	}

}
