class Program5 {

	public static void main(String[] args){

		for(int i = 0; i < 4; i++){
			
			int a = 1;
			
			for(int sp = 3; sp >= i; sp--){

				System.out.print(" ");

			}	


			for(int j = 0; j <= i; j++){

				System.out.print(a + "  ");
				a = a*(i-j)/(j+1);

			}	

			System.out.println();
	

		}
		

	}

}
