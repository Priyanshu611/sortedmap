class Program1 {

	public static void main(String[] args) {

		int[][] arr = {{10,20,30},{40,50,60},{70,90,100}};

		int count = 0;

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				count++;
			}
		}

		System.out.println("The length of the array is "+count);
	

	}

}


