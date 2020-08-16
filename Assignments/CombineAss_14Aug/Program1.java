class Program1 {

	public static void main(String[] args) {

		int year = 1700;

		if(year % 4 == 0){

			System.out.println("Given year is a leap year");

		} else if(year % 100 == 0){

			System.out.println("Given year is not a leap year");
	
		} else if(year % 400 == 0){

			System.out.println("Given year is a leap year");
	
		}  else {

			System.out.println("Given year is not a leap year");
	
		}

	}


}
