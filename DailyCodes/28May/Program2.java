import java.util.*;

class StackDemo {

	public static void main(String[] args){

		Stack s = new Stack();

		s.add("Amazon");
		s.addElement("Microsoft");
		s.push("Tesla");

		System.out.println(s);

		s.pop();

		System.out.println(s);

		System.out.println(s.peek());

		System.out.println(s);

		System.out.println(s.search("Amazon"));

		


	}


}
