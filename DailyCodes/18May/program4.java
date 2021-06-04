import java.util.*;

class LinkListMethod {

	public static void main(String[] args){

		LinkedList l1 = new LinkedList();

		l1.add("C");
		l1.add("Cpp");
		l1.add("Java");
		l1.add("OS");

		System.out.println(l1);

		//add is used to add at that index
		l1.add(3,"Flutter");

		l1.addFirst("Python");

		l1.addLast("Angular");

		System.out.println(l1);

		l1.removeFirst();
		
		System.out.println(l1);

		System.out.println(l1.indexOf("Java"));
		
		System.out.println(l1);

		//set is used to replace at that index
		l1.set(4,"Android");
		
		System.out.println(l1);

	

	}


}
