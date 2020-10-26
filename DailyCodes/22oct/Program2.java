class Temple {

	void darshan() {

		System.out.println("Normal visitors stand in queue");	

	}

	void darshan(String vip) {

		System.out.println(vip);	

	}

}

class Visitors {

	public static void main(String[] args){

		Temple obj1 = new Temple();
		obj1.darshan();
		obj1.darshan("PM/CM they gedt direct darshan");


	}

}


