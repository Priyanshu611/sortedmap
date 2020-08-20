import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

	int ans;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.print("Enter first number: ");
	int a = Integer.parseInt(br.readLine());

	System.out.print("Enter second number: ");
	int b = Integer.parseInt(br.readLine());

	System.out.print("Enter third number: ");
	int c = Integer.parseInt(br.readLine());	
	
	System.out.print("Ascending order of above nos is: ");

	if(a<b && b<c && a<c)
		System.out.print(a + " " + b + " " + c);

	else if(a<b && b>c && a<c)
		System.out.print(a + " " + c + " " + b);

	else if(a<b && b>c && a>c)
		System.out.print(c + " " + a + " " + b);

	else if(a>b && b>c && a>c)
		System.out.print(c + " " + b + " " + a);

	else if(a>b && b<c && a>c)
		System.out.print(b + " " + c + " " + b);
	
	else if(a>b && b<c && a<c)
		System.out.print(b + " " + a + " " + c);

	System.out.println();

	System.out.print("Descending order of above nos is: ");

	if(a<b && b<c && a<c)
		System.out.print(c + " " + b + " " + a);

	else if(a<b && b>c && a<c)
		System.out.print(b + " " + c + " " + a);

	else if(a<b && b>c && a>c)
		System.out.print(b + " " + a + " " + c);

	else if(a>b && b>c && a>c)
		System.out.print(a + " " + b + " " + c);

	else if(a>b && b<c && a>c)
		System.out.print(a + " " + c + " " + b);
	
	else if(a>b && b<c && a<c)
		System.out.print(c + " " + a + " " + b);
	

	System.out.println();


	}

}


