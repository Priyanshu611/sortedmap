class Program3 {

	public static void main(String[] args){

		int num = 1;

		for(int i = 1; i <= 5; i++){

			if(i == 2 ||i == 3||i == 4){
			
				for(int col = 1; col <= 2; col++){

					System.out.print(num + " ");
						
				} 
			} else {
			
				for(int col = 1; col <= 5; col++){

					System.out.print(num + " ");
						
				} 

			}
	
			System.out.println();
			num++;
			

		}

	}

}
