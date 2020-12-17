class Vehicles{

	void types(){

		System.out.println("Vehicle types: Cars,Bike,heavy Vehicles");

	}


}

class Cars extends Vehicles {

	void types(){

		System.out.println("Car types: Sedan,SUV,Sports Car");

	}


}

class Demo1 {

	public static void main(String[] args){

		Vehicles obj1 = new Vehicles();
		obj1.types();

		Cars obj2 = new Cars();
		obj2.types();

	}


}
