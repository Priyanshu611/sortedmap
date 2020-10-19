import java.util.*;

class Program1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String arr[] = new String[]{"Booby","Lilly","Arjun","Priti"};

		System.out.println("Array is:");
		for(int i = 0; i < 4; i++){

			System.out.println(arr[i]);

		}

		System.out.println("Enter the index you want to change:");
		int index = sc.nextInt();

		System.out.println("Enter new string at that index:");
		String s1 = sc.next();

		arr[index] = s1;

		System.out.println("Changed array is:");
		for(int i = 0; i < 4; i++){

			System.out.println(arr[i]);

		}

	}

}
