class Football {

	static int noOfPlayers = 11;//static variable
               int teamRanking = 3;//instance variable

	static void dispPlayers(){ //static method

		System.out.println("Number of players in a team: " + noOfPlayers);

	}

	void dispRanking() {//instance method

		System.out.println("My team ranking is: " + teamRanking);

	}
}

class Captain {

	public static void main(String[] args){

		Football sunilChhetri = new Football();
	 	sunilChhetri.dispPlayers();
		sunilChhetri.teamRanking = 2;//instance var changed
		sunilChhetri.dispRanking();

	}

}
