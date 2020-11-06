import java.io.*;

class EmployeeDetails {

	int empId;
	String empName;
	double empSalary;
	long contact;


	EmployeeDetails(int empId,String empName,double empSalary,long contact) {

		 this.empId = empId;
		 this.empName = empName;
		 this.empSalary = empSalary;
		 this.contact = contact;

	}

	void display(){

		System.out.println("Employee id: " + empId);
		System.out.println("Employee name: " + empName);
		System.out.println("Employee salary: " + empSalary);
		System.out.println("Eployee contact number: " + contact);

	}

}

class MainDemo {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of employees: ");
		int num = Integer.parseInt(br.readLine());

		EmployeeDetails[] arr = new EmployeeDetails[num];

		for(int i = 0; i < num; i++){ 

			System.out.println("Enter details of employes");
			System.out.println("Enter employee id: ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter employee name: ");
			String name = br.readLine();
			System.out.println("Enter employee salary: ");
			double salary = Double.parseDouble(br.readLine());
			System.out.println("Enter employee contact number: ");
			long contactNo = Long.parseLong(br.readLine());

			arr[i] = new EmployeeDetails(id,name,salary,contactNo);

		}

		System.out.println("Output");

		for(int i = 0; i < num; i++){
			
			System.out.println("Employee "+(1+i) +" details are");
			arr[i].display();
			
		}

	}


}


