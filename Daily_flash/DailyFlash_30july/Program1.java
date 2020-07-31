import java.util.*;

class Program1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");//taking input
		int a = sc.nextInt();

		System.out.println("Enter second number");//taking input
		int b = sc.nextInt();

		System.out.println("Enter a operator");//taking input
		char ch = sc.next().charAt(0);

		switch(ch){ //passing the operator in switch

			case '+' :
				System.out.println("a + b = " + (a+b));//add
				break;

			case '-' :
				System.out.println("a - b = " + (a-b));//sub
				break;

			case '*' :
				System.out.println("a * b = " + a*b);//mutilpy
				break;

			case '/' :
				System.out.println("a / b = " + a/b);//divide
				break;

			case '%' :
				System.out.println("a % b = " + a%b);//mod
				break;

			default :
				System.out.println("No such case");//default
				break;



		}



	}



}








