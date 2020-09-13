/*
		1	 A         3	   B         
		5	 C         7	 
		8	 D         
	        10	

*/
class HW1 {

	public static void main(String[] args){

		char ch = 'A';
		int num = 1;

		for(int row = 1; row <= 4; row++){

			for(int col = 4; col >= row; col--){

				if(col == 3|| col == 1 ){

					System.out.print(ch + "         ");
					ch++;
					num++;

				} else {

					System.out.print(num + "	 ");
					num++;

				}

			}

			System.out.println();

		}

	}

}
