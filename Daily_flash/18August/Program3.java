class Program3 {

	public static void main(String[] args){

		char ch = '*';

		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))//range of an alphabet
			System.out.println(ch + " is an Alphabet");

		else if((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64)|| (ch >= 91 && ch <= 96))//range of an special Character
			System.out.println(ch + " is an special Character");

		else
			System.out.println(ch + " is not an Digit");

	}

}
