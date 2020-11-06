import java.io.*;

class Program5 {

	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0,a = 0;

		System.out.println("Enter date");		
		int date = Integer.parseInt(br.readLine());

		System.out.println("Enter month");		
		int month = Integer.parseInt(br.readLine());

		System.out.println("Enter year");		
		int year = Integer.parseInt(br.readLine());

		System.out.printf("Date entered is: %d/%d/%d\n",date,month,year);

		for(int i = 1; i <= year; i++){

			count++;

		}

		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){

			a = 1;

		} else if(month==4||month==6||month==9||month==11){

			a = 3;

		} else
			a = 2;

		switch(a){

			case 1: {

					if(date==31){

						if(year%4==0||year%400==0){

							if(count==4)
								System.out.println("Date is valid");

							else		
								System.out.println("Date is not valid");

						} else if(count==4)
								
							System.out.println("Date is valid");

						else		
							System.out.println("Date is not valid");

					} else		
						System.out.println("Date is not valid");


				}

				break;

			case 2: {

					if(date==28){

						if(year%4==0||year%400==0){

							if(count==4)
								System.out.println("Date is valid");

							else		
								System.out.println("Date is not valid");
				
						} 
					
					} else if(date==28){

								if(count==4)
									System.out.println("Date is valid");

								else		
									System.out.println("Date is not valid");

							 

						} else		
							System.out.println("Date is not valid");

				}

				break;

			case 3: {

					if(date==30){

						if(year%4==0||year%400==0){

							if(count==4)
								System.out.println("Date is valid");

							else		
								System.out.println("Date is not valid");

						} else if(count==4)
								
							System.out.println("Date is valid");

						else		
							System.out.println("Date is not valid");

					} else		
						System.out.println("Date is not valid");


				}

				break;




		}


	}


}

