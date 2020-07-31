class Program2 {

	public static void main(String[] args){

		char ch = 'a'; // upper case
		System.out.println("Input---> " + ch);

		switch(ch){ //char value
			case 'A':
				System.out.println("Output---> a");
				break;

			case 'a':
				System.out.println("Output---> A");
				break;

			default:
				System.out.println("No such case");
				break;

		}

	}

}
