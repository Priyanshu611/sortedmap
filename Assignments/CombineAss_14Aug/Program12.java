class Program12 {

	public static void main(String[] args){

		int i = 5, j = 10, k = 15;
		boolean ans;
                                    
		ans = (i < (j - 10)) ? true : false;
		System.out.println(i + " " + j + " " + ans);//false

		ans = (i == (i = j)) ? true : false;
		System.out.println(i + " " + j + " " + ans);//false

		ans = ((i & j &k)!= 0) ? true : false;
		System.out.println(i + " " + j + " " + ans);//true

		ans = ((i^j >>2)==0) ? true : false;
		System.out.println(i + " " + j + " " + ans);//false  

	}

}
