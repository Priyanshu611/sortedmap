class IPL {

	int runs = 200;

	String PlayerName = "Virat Kohli";

	IPL(){

		System.out.println("Player name = " + PlayerName);
		System.out.println("Player runs = " + runs);

	}

}


class Match {

	public static void main(String[] args){

		IPL ipl = new IPL();
		ipl.runs = 300;
		
		IPL ipl2020 = new IPL();

	}

}
