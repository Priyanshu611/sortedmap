class Operators3 {

	public static void main(String[] args){

		int i = 5, j = 4;
		boolean ans;

		ans = (i++ >= j++)&&(--j < i++);
                System.out.println(ans);//true

                ans = (--i < j--)&&(j++ >= ++i);
                System.out.println(ans);//false


        }

}
