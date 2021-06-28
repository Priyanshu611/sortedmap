class Core2Web {

	Core2Web(){

		System.out.println("Core2Web Constructor");

	}

	void learning(){

		System.out.println("Programming Language");
		System.out.println("Guide: Shashi");

	}


}

class Incubator extends Core2Web {

	Incubator(){
	
		System.out.println("Incubator Constructor");

	}

	void implementation(){
	
		System.out.println("Coding challenge");

	}


}

class Student {

	public static void main(String[] args){

		Core2Web obj = new Core2Web();
		obj.learning();

		/*Core2Web obj1 = new Incubator();
		obj1.implementation();*/

		Incubator obj2 = new Incubator();
		obj2.implementation();


	}

}


