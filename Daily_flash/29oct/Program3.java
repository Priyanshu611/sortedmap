abstract class Cars {

	abstract void mileage();
	abstract void price();

	void seater(){

		System.out.println("4 seater");

	}

}
	

class BMW extends Cars{

	void mileage() {

		System.out.println("17.66 kmpl");

	}


	void price() {

		System.out.println("98.9 lakh");

	}

	
}	

class BuyingCar {

	public static void main(String[] args){

		System.out.println("BMW 7 series: ");

		Cars obj1 = new BMW();

		obj1.mileage();
		obj1.price();
		obj1.seater();

		BMW obj2 =  new BMW();

		obj2.mileage();
		obj2.price();
		obj2.seater();
		

	}


}






