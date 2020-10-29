class MarutiSuzuki {

	void engine(){

		System.out.println("Maruti Suzuki produces Diesel as well as Petrol engine cars");		

	}

	
}

class Maruti extends MarutiSuzuki{

	void engine(){

		System.out.println("First car of Maruti was Maruti 800 with F8B engine");		
	
	}

	
}

class Suzuki extends MarutiSuzuki {

	void engine(){

		System.out.println("First car of Suzuki was Suzulight with FB engine");	
		
	}


}

class car {


	public static void main(String[] args){

		System.out.println("Engine: ");

		MarutiSuzuki obj =  new MarutiSuzuki();
		Maruti obj1 =  new Maruti();
		Suzuki obj2 =  new Suzuki();

		obj.engine();
		obj1.engine();
		obj2.engine();

	}



}




