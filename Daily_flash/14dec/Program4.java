class Member{

	String Name;
	int age;
	long phnNo;
	String addr;
	float salary;

	void printSalary(){

		System.out.println("Salary = " + salary);

	}

}

class Employee extends Member{

	String specialiation;
	String department;

}

class Manager extends Member{

	String specialiation = "MBA";
	String department = "Management";

}

class Demo2 {

	public static void main(String[] args){

		Employee obj1 = new Employee();

		obj1.Name = "Priyanshu Singh";
		obj1.age = 20;
		obj1.phnNo = 1233597752;
		obj1.addr = "DP Road Pune";
		obj1.salary = 90000;
		obj1.specialiation = "Java";
		obj1.department = "Development";

		Manager obj2 = new Manager();
		
		obj2.Name = "Ananya Shah";
		obj2.age = 30;
		obj2.phnNo = 987456325;
		obj2.addr = "Kalyani Nagar Pune";
		obj2.salary = 120000;
		obj2.specialiation = "MBA";
		obj2.department = "Management";

		System.out.println("Employee Details: ");
		System.out.println();
		System.out.println("Employee Name: " + obj1.Name);		
		System.out.println("Employee Age: " + obj1.age);
		System.out.println("Employee phn number: " + obj1.phnNo);
		System.out.println("Employee Address: " + obj1.addr);
		System.out.println("Employee salary: ");
		obj1.printSalary();
		System.out.println("Employee specialiation : " + obj1.specialiation);
		System.out.println("Employee department: " +obj1.department);
		System.out.println();



		System.out.println("Manager Details: ");
		System.out.println();
		System.out.println("Manager Name: " + obj2.Name);		
		System.out.println("Manager Age: " + obj2.age);
		System.out.println("Manager phn number: " + obj2.phnNo);
		System.out.println("Manager Address: " + obj2.addr);
		System.out.println("Manager salary: ");
		obj2.printSalary();
		System.out.println("Manager specialiation : " + obj2.specialiation);
		System.out.println("Manager department: " + obj2.department);
		

	}
}


