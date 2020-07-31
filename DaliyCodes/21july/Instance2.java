class Cricket2 {

	public static void main(String[] args) {

		Cricket test = new Cricket();
		Cricket oneday = new Cricket();
		Cricket t20 = new Cricket();
		Cricket thirty5 = null;

		System.out.println(test instanceof Object);//true
		System.out.println(oneday instanceof Object); //true
		System.out.println(t20 instanceof Object);//true
		System.out.println(thirty5 instanceof Object);//false
	
	}



}
