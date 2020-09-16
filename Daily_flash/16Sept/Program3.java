/*
2	
5	10	
17	26	37	
50	65	82	101	



*/

class Program3 {

	public static void main(String[] args){

		int cal = 0,num = 1;

		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= row; col++){

					cal =num*num+1;
					System.out.printf("%d\t",cal);
					num++;

			}

			
			System.out.println();
		

		}


	}


}
