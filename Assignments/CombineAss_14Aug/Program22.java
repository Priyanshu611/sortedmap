class Program22 {

	public static void main(String[] args) {

		char ch = 'm';
		String sVar;

		if(ch == 'A'||ch == 'E'||ch=='I'||ch=='O'||ch=='U'||ch == 'a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u')
			sVar = "Vowel";

		else
			sVar = "Consonant";

		switch(sVar){

			case "Vowel":
				System.out.println(ch + " is a Vowel");
				break;

			case "Consonant":
				System.out.println(ch + " is a Consonant");
				break;

		}

	}

}
