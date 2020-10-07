import java.util.*;

class Program3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		double arr1[][][] = new double[2][][];

		arr1[0][3] = new double[3][];
		arr1[1][2] = new double[5][];
		arr1[2][3] = new double[2][];

		//enter elements
		System.out.printf("Enter elements of array\n");
		for(int i = 0; i < arr1.length; i++){

			for(int j = 0; j < arr1[i].length; j++){

				for(int k = 0; k < arr1[i][j].length; k++){

					arr1[i][j][k] = sc.nextDouble();

				}

			}

		}		


		//printing the arrays
		System.out.printf("Elements of array are:\n");
		System.out.printf("Elements of 1st plane:\n");
		for(int i = 0; i < arr1.length; i++){

			if(i>0)
				System.out.printf("Elements of %d plane:\n",i+1);

			for(int j = 0; j < arr1[i].length; j++){

				for(int k = 0; k < arr1[i][j].length; k++){

					System.out.print(arr1[i][j][k]+ "	");

				}

				System.out.println();

			}

			System.out.println();

		}		

	}

}


