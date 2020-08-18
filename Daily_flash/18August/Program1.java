class Program1 {

	public static void main(String[] args){

		char ch = 'v';

		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))//range of an alphabet
			System.out.println(ch + " is an alphabet");

		else
			System.out.println(ch + " is not an alphabet");

	}

}
