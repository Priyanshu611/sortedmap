import java.io.*;

class DuplicateChar{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String");
		String str = br.readLine();

		char ch[] = str.toCharArray();

		for(int i = 0; i < ch.length; i++){

			char temp = ch[i];
			int count = 0;
			for(int j = i+1; j < ch.length; j++){

				if(temp == ch[j])
					count++;

			}

			if(count > 0)
				System.out.println(temp);

		}

	}


}
