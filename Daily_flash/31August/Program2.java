/*Print all the nos ranging between 1 to 100 that are divisible by 4 and 7*/

class Program2 {

	public static void main(String[] args){

		for(int i = 1; i <= 100; i++){

			if(i%4 == 0 && i%7 == 0){

				System.out.print(i + " ");

			}

		}

	}

}
