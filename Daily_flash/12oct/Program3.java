class Program3 {

	public static void main(String[] args){

		String s1 = "Priyanshu";
		String s2 = new String("Singh");

		System.out.println(s1 + " " + s2);

	}

}

/*

	Here s1 is a string literal hence it will be stored in String Cinstant Pool only
	and s2 is a string object so its refrence will be on heap and a without refrence object
	will be on SCP and while storing a copy on SCP it will check whether that string is already present on SCP
	or not if it is alredy present then it will not make a copy of it and if it is not present then it will make a copy of it on SCP.

*/
