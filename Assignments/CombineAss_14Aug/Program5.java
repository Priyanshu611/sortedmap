class Program5 {

	public static void main(String[] args){

		String sc = "abcd";

		int index = sc.length();

		for(int i = 0; i < index; i++){

			char ch = sc.charAt(i);
			int ascii = (int) ch;
			System.out.println(ch + " = " + ascii);		

		}

	}

}
