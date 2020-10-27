import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		System.out.println("Enter a string:");
		sb.append(sc.next());

		sb.append("Technologies");
		System.out.println(sb);
		System.out.println("Capacity is "+sb.capacity());

		sb.append("Biencaps");
		System.out.println(sb);
		System.out.println("Capacity is "+sb.capacity());

	}

}
