interface Team {

	void getPlayerNum();
	void getPlayerName();

	default void winLoss(int win, int loss){

		System.out.println("Win = " + win);
		System.out.println("Loss = " + loss);

	}
	

}
	

class RCB implements Team{

	public void getPlayerNum() {

		System.out.println("Jersey no. 18");

	}


	public void getPlayerName(){

		System.out.println("Virat kohli");

	}

	
}

class CSK implements Team{

	public void getPlayerNum() {

		System.out.println("Jersey no. 7");

	}


	public void getPlayerName(){

		System.out.println("MSD");

	}

	
}

	

class IPL2020 {

	public static void main(String[] args){

		RCB obj1 = new RCB();

		obj1.getPlayerNum();
		obj1.getPlayerName();
		obj1.winLoss(7,5);

		CSK obj2 = new CSK();

		obj2.getPlayerNum();
		obj2.getPlayerName();
		obj2.winLoss(8,4);


	}


}






