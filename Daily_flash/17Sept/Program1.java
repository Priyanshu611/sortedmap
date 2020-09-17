class Program1 {

	public static void main(String[] args){

		int num = 1, n = 1;

		for(int i = 1; i <= 5; i++){

			for(int col = 1; col <= i; col++){

				System.out.print(num + " ");
				num--;

			}

			System.out.println();
			num = n + i;
			

		}

	}

}
