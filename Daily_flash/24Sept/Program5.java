import java.io.*;
import java.util.*;

class Program5 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int i = 1; i <= 4; i++){
	
			System.out.println("Enter name grade age and marks");
			String data = br.readLine();

			if(i == 1){
				StringTokenizer st = new StringTokenizer(data," ");

				String token1 = st.nextToken().trim();
				String token2 = st.nextToken().trim();
				String token3 = st.nextToken().trim();
				String token4 = st.nextToken().trim();

				String name = token1; 
				char grade = token2.charAt(0);
				int age = Integer.parseInt(token3);	
				double marks = Double.parseDouble(token4);

				System.out.println("Entered name is: " + name);
				System.out.println("Entered grade is: " + grade);
				System.out.println("Entered age is: " + age);
				System.out.println("Entered marks are: " + marks);

				System.out.println();

			}else if(i == 2){
				StringTokenizer st = new StringTokenizer(data,",");

				String token1 = st.nextToken().trim();
				String token2 = st.nextToken().trim();
				String token3 = st.nextToken().trim();
				String token4 = st.nextToken().trim();

				String name = token1; 
				char grade = token2.charAt(0);
				int age = Integer.parseInt(token3);	
				double marks = Double.parseDouble(token4);

				System.out.println("Entered name is: " + name);
				System.out.println("Entered grade is: " + grade);
				System.out.println("Entered age is: " + age);
				System.out.println("Entered marks are: " + marks);

				System.out.println();

			}else if(i == 3){
				StringTokenizer st = new StringTokenizer(data,":");

				String token1 = st.nextToken().trim();
				String token2 = st.nextToken().trim();
				String token3 = st.nextToken().trim();
				String token4 = st.nextToken().trim();

				String name = token1; 
				char grade = token2.charAt(0);
				int age = Integer.parseInt(token3);	
				double marks = Double.parseDouble(token4);

				System.out.println("Entered name is: " + name);
				System.out.println("Entered grade is: " + grade);
				System.out.println("Entered age is: " + age);
				System.out.println("Entered marks are: " + marks);

				System.out.println();

			}else if(i == 4){
				StringTokenizer st = new StringTokenizer(data,"-");

				String token1 = st.nextToken().trim();
				String token2 = st.nextToken().trim();
				String token3 = st.nextToken().trim();
				String token4 = st.nextToken().trim();

				String name = token1; 
				char grade = token2.charAt(0);
				int age = Integer.parseInt(token3);	
				double marks = Double.parseDouble(token4);

				System.out.println("Entered name is: " + name);
				System.out.println("Entered grade is: " + grade);
				System.out.println("Entered age is: " + age);
				System.out.println("Entered marks are: " + marks);

				System.out.println();

			}

		}

	}

}


