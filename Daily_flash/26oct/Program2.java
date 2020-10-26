import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		System.out.println("Enter a string: ");
		sb.append(sc.next());

		System.out.println("Enter an Index: ");
		int index = sc.nextInt();

		char ch;

		if(sb.charAt(index) >= 65 && sb.charAt(index) <= 91){

			ch=sb.charAt(index);
			sb.deleteCharAt(index);
			ch+=32;
			sb.insert(index,ch);
			System.out.println(sb);

		} else {

			ch=sb.charAt(index);
			sb.deleteCharAt(index);
			ch-=32;
			sb.insert(index,ch);
			System.out.println(sb);
		}

	}

}
