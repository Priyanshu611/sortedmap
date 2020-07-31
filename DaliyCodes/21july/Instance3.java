class Football {







}


class Cricket3 {

	public static void main(String[] args) {

		Cricket test = new Cricket();
		Cricket oneday = new Cricket();
		Football match = new Football();
		Football league = new Football();
		
		System.out.println(test instanceof Object);//true
		System.out.println(oneday instanceof Cricket); //true
		System.out.println(match instanceof Football);//true
		System.out.println(league instanceof Object);//ture
	
	}



}
