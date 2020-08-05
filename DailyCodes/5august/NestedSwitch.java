class NestedSwitch {

	public static void main(String[] args){

		int floor = 3;

		switch(floor){

			case 1:
			   {

				char ch ='S';// s is for shopping and F for food court
				switch(ch){

					case 'S':
					case 's':
						System.out.println("Shopping");
						break;

					case 'F':
					case 'f':
						System.out.println("Food court");
						break;

					default:
						System.out.println("service not available");

				}

			   }
				break;

			case 2:
			   {

				char ch ='g';
				switch(ch){

					case 'm':
					case 'M':
						System.out.println("Movie - Dil Bechara");
						break;

					case 'G':
					case 'g':
						System.out.println("Game zone");
						break;

					default:
						System.out.println("service not available");

				}

			   }
				break;

				default:
						System.out.println("Wrong floor");

		}

	}	



}
