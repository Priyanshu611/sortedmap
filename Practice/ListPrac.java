//returning multiple values in java

import java.util.*;

class GFG {

	public static List<Object> getDetails(){

		String name = "Geek";
		int age = 35;
		char gender = 'M';

		//returning multiple values in java
		return Arrays.asList(name,age,gender);

	}

	public static void main(String[] args){

		List<Object> person = getDetails();
		System.out.println(person);


	}

}
