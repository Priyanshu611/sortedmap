
class Person {

	String role = "Data Scientist";
	float salary = 100000;
	int id = 67;
}

class Job {

	Person Priyanshu = new Person();
	
	void Info() {
		System.out.println("Role of Person is "+Priyanshu.role);
		System.out.println("Salary of Person is "+Priyanshu.salary);
		System.out.println("Id of Person is "+Priyanshu.id);
	}
}

class Demo {

	public static void main(String[] args) {

		Job engineer = new Job();
		engineer.Info();
	}
}
