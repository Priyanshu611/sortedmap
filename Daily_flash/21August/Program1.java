import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

		float pie = 3.14f;
		float area;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the radius of the circle: ");
		float r = Float.parseFloat(br.readLine());

		area = pie*r*r;

		System.out.println("Area of the circle is: " + area);

	}

}
