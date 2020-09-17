/*
		A B C D E F 
		A B C D E 
		A B C D 
		A B C 
		A B 
		A 
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 
		A B C D E F 


*/


class Program5 {

	public static void main(String[] args){

		//for loop for row
		for(int row = 1; row <= 6; row++){

			char ch = 'A';

			for(int col = 6; col >= row; col--){

				System.out.print(ch + " ");
				ch++;

				}
			
			System.out.println();
			
		}  

		//for loop for row
		for(int row = 1; row <= 6; row++){

			char ch = 'A';

			for(int col = 1; col <= row; col++){

				System.out.print(ch + " ");
				ch++;

				}
			
			System.out.println();
			
		}   

		                        

	}


}
