class Restaurant {

	class Drinks {

		void menu() {

			System.out.println("Drinks:");
			System.out.println("Pink Lemonade");
			System.out.println("Guava Mojito");
			System.out.println("Iced Tea");
			System.out.println("Orange Drink");
			System.out.println();

		}		


	}

	class Foods {

		void menu() {

			System.out.println("Foods:");
			System.out.println("Lemon Rice");
			System.out.println("Vegetable Jalferezi");
			System.out.println("White sauce Pasta");
			System.out.println("Tandoori paneer pizza");

		}		


	}

}

class Resto {

	public static void main(String[] args){

		new Restaurant().new Drinks().menu();
		new Restaurant().new Foods().menu();


	}


}
