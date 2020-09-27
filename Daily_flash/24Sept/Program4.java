import java.util.*;

class Program4 {

	public static void main(String[] args) {

		
		String one = "Swarupa,A,20,32.2";
		String two = "Sonia,C,23,52.05";

		StringTokenizer st = new StringTokenizer(one,",");
		StringTokenizer st1 = new StringTokenizer(two,",");
		

		for(int i = 0; i < one.length(); i++){

			String name = st.nextToken(); 
			char grade = st.nextToken().charAt(0);
			int age = Integer.parseInt(st.nextToken().trim());	
			double marks = Double.parseDouble(st.nextToken().trim());

			System.out.println("Entered name is: " + name);
			System.out.println("Entered grade is: " + grade);
			System.out.println("Entered age is: " + age);
			System.out.println("Entered marks are: " + marks);

		}

		int j = 0;
		while(j < two.length()){

			String name = st.nextToken(); 
			char grade = st.nextToken().charAt(0);
			int age = Integer.parseInt(st.nextToken().trim());	
			double marks = Double.parseDouble(st.nextToken().trim());

			System.out.println("Entered name is: " + name);
			System.out.println("Entered grade is: " + grade);
			System.out.println("Entered age is: " + age);
			System.out.println("Entered marks are: " + marks);

			j++;

		}

			
		
	}

}


