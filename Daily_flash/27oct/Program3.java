import java.util.*;

class Program3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();

		System.out.println("Enter a string:");
		sb.append(sc.next());

		int length = sb.length();
		int a = length;
		System.out.println("Length is: "+ length);

		sb.insert(8,"Technologies");
		System.out.println(sb);

		System.out.println(sb.reverse());		

		sb.reverse();

		sb.replace(8,19,"Biencaps");
		System.out.println(sb);

		length = sb.length();

		sb.delete(a,length);
		System.out.println(sb);

		System.out.println(sb.substring(0,5));
		System.out.println(sb);

		char ch = sb.charAt(5);

		System.out.println(ch);
		System.out.println(sb);



	}

}
