//find union and intersection of 2 sorted array

import java.io.*;

class UnionArray {

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the size of 1st array");
	int size1 = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the size of 2nd array");
	int size2 = Integer.parseInt(br.readLine());
	
	int arr1[] = new int[size1];

	int arr2[] = new int[size2];

	System.out.println("Enter array elements of 1st array");
	for(int i = 0; i < size1; i++){

		arr1[i] = Integer.parseInt(br.readLine());

	}

	System.out.println("Enter array elements of 2nd array");
	for(int i = 0; i < size2; i++){

		arr2[i] = Integer.parseInt(br.readLine());

	}


	System.out.println("1st Array elements are");

	for(int i = 0; i < arr1.length; i++){

		System.out.println(arr1[i]);
	
	}

	System.out.println("2nd Array elements are");

	for(int i = 0; i < arr2.length; i++){

		System.out.println(arr2[i]);
	
	}
	System.out.println("Union");
	//union
	
	int i = 0,j = 0;
	while(i < size1 && j < size2){

			if(arr1[i] < arr2[j]){

				System.out.println(arr1[i]);
				i++;

			}else if(arr2[j] < arr1[i])	{

				System.out.println(arr2[j]);
				j++;

			} else {

				System.out.println(arr2[j]);
				j++;
				i++;

			}

	}
			
			while(i < size1){

				System.out.println(arr1[i]);
				i++;

			}

		
			while(j < size2){

				System.out.println(arr2[j]);
				j++;

			}

	//intersection
	System.out.println("Intersection");
	int k = 0,l = 0;
	while(k < size1 && l < size2){

			if(arr1[k] < arr2[l]){

				k++;

			}else if(arr2[l] < arr1[k])	{

				l++;

			} else {

				System.out.println(arr2[l]);
				l++;
				k++;

			}

	}
		
		 
	

	
	}

} 

/*


void UnionArr(int arr1[],int arr2[]){
		//union
		int k=0;
		int uni[] = arr1.clone();
		for(int i=0;i<arr1.length;i++){
				System.out.print(arr1[i]+"\t");
		}
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<uni.length;j++){
				if(arr2[i]==uni[j]){
					k=1;
				}
			}
			if(k==0){
			System.out.print(arr2[i]+"\t");
			}
			k=0;
				
				
		}
		
		
	}



*/


	





