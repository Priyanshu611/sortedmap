class Program1 {

	public static void main(String[] args){

		int num = 9; // betweeen 1 to 7
		System.out.println("Input---> " + num);

		switch(num){ //int value
			case 1:
				System.out.println("Output---> Monday");
				break;

			case 2:
				System.out.println("Output---> Tuesday");
				break;

			case 3:
				System.out.println("Output---> Wednesday");
				break;

			case 4:
				System.out.println("Output---> Thursday");
				break;

			case 5:
				System.out.println("Output---> Friday");
				break;

			case 6:
				System.out.println("Output---> Saturday");
				break;

			case 7:
				System.out.println("Output---> Sunday");
				break;

			default:
				System.out.println("No such case");
				break;

		}

	}

}
