class Trip {

	void place() {

		System.out.println("Oohhh Goa");

	}

}

class Today{

	public static void main(String[] args){

		Trip obj = new Trip() {

			void place(){

				System.out.println("Alibagh");

			}

		};

		obj.place();

	}

}
