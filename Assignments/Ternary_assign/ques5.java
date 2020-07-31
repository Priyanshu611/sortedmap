class TataGroup{

	public static void main(String[] args){

		TataGroup tanishq = new TataGroup();
		TataGroup jaguar = new TataGroup();
		TataGroup taj = new TataGroup();
		TataGroup whirlpool = null;

		boolean isTanishqTata = tanishq instanceof TataGroup;
		System.out.println("Is Tanishq subsidiarie of Tata Group --> " + isTanishqTata);//true

		boolean isJaguarTata = jaguar instanceof TataGroup;
		System.out.println("Is Jaguar motors subsidiarie of Tata Group  --> " + isJaguarTata);//true

		boolean isTajTata = taj instanceof TataGroup;
		System.out.println("Is Taj Hotels subsidiarie of Tata Group  --> " + isTajTata);//true

		boolean isWhirlpoolTata = whirlpool instanceof TataGroup;
		System.out.println("Is Whirlpool subsidiarie of Tata Group  --> " + isWhirlpoolTata);//false


	}

}
