class Car {

	Car() {

		System.out.println("Baleno");

	}

	class Engine {

		void type() {

			System.out.println("Diesel Engine");

		}

	}

	class Brake {

		void type() {

			System.out.println("Drum Brake System");

		}

	}

	public static void main(String args[]){

		Car obj = new Car();
		Engine e1 = obj.new Engine();
		e1.type();

		Brake b1 = obj.new Brake();
		b1.type();

	}

}


