import java.util.*;

class Program1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		System.out.println("Enter a string: ");
		sb.append(sc.next());

		System.out.println(sb.substring(0,5));

	}

}
