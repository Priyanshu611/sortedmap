
class Program5 {

	public static void main(String[] args){

		int flag;

		for(int row = 1; row<=5; row++){
			
			if(row == 2 || row ==4)
				flag = 1;
		
			else
				flag = 0;

			for(int col = 1; col<=5; col++){

				if(flag==0){

					System.out.printf("%d ", flag);
					flag = 1;

				} else {

					System.out.printf("%d ", flag);
					flag = 0;
				}

				

			}

			System.out.println();

		}

		
	}

}


