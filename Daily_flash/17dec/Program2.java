class Degree {

	void getDegree(){

		System.out.println("I got a degree\n");

	}

}

class Undergraduate extends Degree {

	void getDegree(){

		System.out.println("I am an Undergraduate\n");

	}

}

class Postgraduate extends Degree {

	void getDegree(){

		System.out.println("I am a Postgraduate\n");

	}

}

class Demo {

	public static void main(String[] args){

		Degree obj1 = new Degree();
		obj1.getDegree();

		Undergraduate obj2 = new Undergraduate();
		obj2.getDegree();

		Postgraduate obj3 = new Postgraduate();
		obj3.getDegree();


	}


}


