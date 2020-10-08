import java.util.*;

class Program2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][];
		int arr1[][] = new int[3][];
		int arr2[][] = {{9},{11,12},{89,78,64}};

		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];

		arr1[0] = new int[]{10};
		arr1[1] = new int[]{20,30};
		arr1[2] = new int[]{40,50,60};

		System.out.println("Enter the elements for 1st array: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				arr[i][j] = sc.nextInt();

			}

		}

		System.out.println("Elements of the 1st array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				System.out.print(arr[i][j] + "  ");

			}

			System.out.println();

		}


		System.out.println("Elements of the 2nd array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr1[i].length; j++){

				System.out.print(arr1[i][j] + "  ");

			}

			System.out.println();

		}

		System.out.println("Elements of the 3rd array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr2[i].length; j++){

				System.out.print(arr2[i][j] + "  ");

			}

			System.out.println();

		}



	}

}
