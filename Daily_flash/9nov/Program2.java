class Student {
	
	String name;

	Student() {

		System.out.println("Unknown");

	}

	Student(String name) {

		this.name = name;

		System.out.println("Name of the student: " + name);

	}

	

	public static void main(String args[]){

		Student obj = new Student();
		Student obj1 = new Student("Priyanshu");

	}


}


