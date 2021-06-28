import java.io.*;
import java.util.*;

class RevString {

	public static void main(String[] args)throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string");
		String str = br.readLine();
		char ch[] = str.toCharArray();
		String ch1 = "";

		for(int i = ch.length-1;i >= 0; i--){

			ch1 = ch1 + ch[i];
			

		}

		
		System.out.println(ch1);

		

	}



}
