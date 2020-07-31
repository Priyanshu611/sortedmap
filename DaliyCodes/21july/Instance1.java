class Cricket {

	public static void main(String[] args) {

		Cricket test = new Cricket();
		Cricket oneday = new Cricket();
		Cricket t20 = new Cricket();
		Cricket thirty5 = null;

		System.out.println(test instanceof Cricket);//true
		System.out.println(oneday instanceof Cricket); //true
		System.out.println(t20 instanceof Cricket);//true
		System.out.println(thirty5 instanceof Cricket);//false
	
	}



}
