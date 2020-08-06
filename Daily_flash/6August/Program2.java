import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Students year");//taking input
		int year = sc.nextInt();

		System.out.println("Enter Students marks");//taking input
		int marks = sc.nextInt();//marks less than 70 not eligible for scholarship

		switch(year){ //passing year in switch

			
			case 1 :
				System.out.println("1st year students are not eligible for eduation scholarship");
				break;

			case 2 :
				System.out.println("2nd year students are not eligible for eduation scholarship");
				break;


			case 3 :
				{

					switch(marks/10){// passing students marks to check eligibility

						case 9 :
							System.out.println("Student eligible for Education scholarship");
							break;

						case 8 :
							System.out.println("Student eligible for Education scholarship");
							break;

						case 7 :
							System.out.println("Student eligible for Education scholarship");
							break;	

						default :
							System.out.println("Student not eligible for Education scholarship");//default
							break;					

					}

				}

				break;

			case 4 :
				{

					switch(marks/10){// passing students marks to check eligibility

						case 9 :
							System.out.println("Student eligible for Education scholarship");
							break;

						case 8 :
							System.out.println("Student eligible for Education scholarship");
							break;

						case 7 :
							System.out.println("Student eligible for Education scholarship");
							break;	

						default :
							System.out.println("Student not eligible for Education scholarship");//default
							break;					

					}

				}

				break;

			default :
				System.out.println("No such case");//default
				break;



		}



	}



}








