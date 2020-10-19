class Program3 {

	public static void main(String[] args){

		String s1 = new String("Bielearn");


		System.out.println(s1.indexOf('l'));//3
		System.out.println(s1.indexOf('e'));//2
		System.out.println(s1.indexOf('e',3));//4
		System.out.println(s1.indexOf("learn"));//3
		System.out.println(s1.indexOf("earn",5));//-1
		System.out.println(s1.indexOf("earn",4));//4


	}

}
