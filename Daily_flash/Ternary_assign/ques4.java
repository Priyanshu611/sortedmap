class Human{

	public static void main(String[] args){

		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and HUman of same species --> " + isLionHuman);//false

		boolean isTigerHuman = tiger instanceof Human;
		System.out.println("Are Tiger and HUman of same species --> " + isTigerHuman);//false

		boolean isPumaHuman = puma instanceof Human;
		System.out.println("Are Puma and Human of same species --> " + isPumaHuman);//false

		boolean isMonkeyHuman = monkey instanceof Human;
		System.out.println("Are Monkey and HUman of same species --> " + isMonkeyHuman);//true

	}

}

/*

instanceof operator is true only for object as when we make object than an only 
it is assigned space on the heap. 
   As 'reference' are given space on heap hence it gives false for all the reference.


*/
