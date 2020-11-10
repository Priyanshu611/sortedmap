class CarModel {
	
	String name;

	CarModel(String name) {

		this.name = name;

	}

	void getModelName() {

		System.out.println("Model name is: " + name);

	}

	

	public static void main(String args[]){

		CarModel obj1 = new CarModel("Baleno");
		obj1.getModelName();

	}


}


