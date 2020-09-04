import java.io.*;

class Program5 {

	public static void main(String[] args)throws IOException {

		int area;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	

		System.out.print("Enter date: ");
		int date = Integer.parseInt(br.readLine());
		System.out.print("Enter month: ");
		int month = Integer.parseInt(br.readLine());
		System.out.print("Enter year: ");
		int year = Integer.parseInt(br.readLine());

		System.out.printf("Date entered by you is: %d/%d/%d\n",date,month,year);

		switch(month){


			case 1:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			case 2:{

					if(date <=28)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			 case 3:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

	  		 case 4:{

					if(date <= 30)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			 case 5:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

					break;

			case 6:{

					if(date <= 30)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

					break;

			case 7:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

					break;

			case 8:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

					break;

			case 9:{

					if(date <= 30)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			case 10:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			case 11:{

					if(date <= 30)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			case 12:{

					if(date <= 31)
						System.out.println("You entered a valid date");
					else
						System.out.println("Date does not exist!!!");

				}

				break;

			default:
					System.out.println("Date does not exist!!!");
					break;


		}

	}

}


