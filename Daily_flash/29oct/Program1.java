class TV {

	void turnOn(boolean tvRemote){

		if(tvRemote)
			System.out.println("TV is on");

		else
			System.out.println("TV is off");
		
	}

	void turnOn(boolean tvRemote, boolean setupBox){

		if(tvRemote && setupBox)
			System.out.println("TV is on");

		else
			System.out.println("TV is off");

	}

	public static void main(String[] args){

		System.out.println("Output: ");

		TV obj1 =  new TV();

		obj1.turnOn(true);
		obj1.turnOn(true,false);

	}

}


