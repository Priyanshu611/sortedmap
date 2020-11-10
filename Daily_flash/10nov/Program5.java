class Mall {

	void name() {

		System.out.println("Phoenix Marketcity, Viman Nagar");
		System.out.println();


	}

	class Shopping {

		void Choice() {

			System.out.println("Shopping Brands:-");
			System.out.println("Zara");
			System.out.println("Ritu Kumar store");
			System.out.println("H&M");
			System.out.println("Aurelia");
			System.out.println("AND");
			System.out.println();

		}		


	}

	class Food {

		void Choice() {

			System.out.println("Food Court consist of:-");
			System.out.println("Starbucks");
			System.out.println("Mad Over Donuts");
			System.out.println("Domino's");
			System.out.println("Zaheer Khan's Dine");
			System.out.println("Rajdhani");

		}		


	}

}

class Purchase {

	public static void main(String[] args){

		Mall m1 = new Mall();
		m1.name();

		new Mall().new Shopping().Choice();
		new Mall().new Food().Choice();


	}

}


