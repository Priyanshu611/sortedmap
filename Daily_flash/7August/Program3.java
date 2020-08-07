/*
		Write a program using while loop to print first 10nos which ar divisible by 333332 abd 7.
		(Break the loop if any no divisible by 32 and 7)
		i/p - 12345
		o/p - addition of even digits - 6
		      multiplicaton of odd digits - 15

*/


class Program3 {

	public static void main(String[] args){

		int i = 1, count = 1;

		while(count != 10){

			if(i%7 == 0 && i%32 == 0) {

				System.out.print( i + "  " );
				count++;	
 
				if(i%6 == 0){// check condition

					System.out.println();
					System.out.println("Breaking the loop");
					System.out.println( i + " is divisible by 6");
					count++;//inc count
					break;
				}

			}  

			i++;//incrementing i
			
		}


	}

}
