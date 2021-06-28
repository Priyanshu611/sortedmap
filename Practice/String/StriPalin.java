import java.io.*;

class StringPalindrome {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a string");
		String str1 = br.readLine();

		char ch[] = str1.toCharArray();

		String str2 = "";

		for(int i = ch.length-1; i >= 0; i--){

			str2+=ch[i];

		}
		System.out.println("Reversed string is " + str2);

		if(str1.equals(str2))
			 System.out.println("Entered string is palindorme");

		else
			System.out.println("Entered string is not a palindorme");


	}


}
