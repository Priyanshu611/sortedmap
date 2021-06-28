/*

Inner class

Inner classes are a security mechanism in Java. We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private. And this is also used to access the private members of a class.

*/

class Volkswagen {

	class  Audi{

		void price(){

			System.out.println("60 Lac");

		}


	}

	class  Buggati{

		void price(){

			System.out.println("1.5 Cr");

		}



	}

	class  Lamborgini{

		void model(){

			System.out.println("Aventador");

		}



	}

	class  Bentley{

		void model(){

			System.out.println("Azure");

		}

	}

}

class Demo{


	public static void main(String[] args){

		Volkswagen obj1 = new Volkswagen();
		Volkswagen.Audi A7 = obj1.new Audi();
		A7.price();

		new Volkswagen().new Buggati().price();

		new Volkswagen().new Lamborgini().model();

		Volkswagen.Bentley obj = obj1.new Bentley();
		obj.model();  

	}

}
