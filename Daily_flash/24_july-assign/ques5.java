class Attendance {

	boolean isEligiblbe(int student1){

		System.out.println("Student's attendance is " + student1+"%");

		System.out.println("Processing...");

		if(student1>=75)
			System.out.println("The student1 is eligible for exam ");

		else
			System.out.println("The student1 is not eligible for exam ");

	return true;

	}

	public static void main(String[] args) {

		Attendance obj = new Attendance();

		obj.isEligiblbe(65);

	}

}
