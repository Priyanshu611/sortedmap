class Operators2 {

	public static void main(String[] args){

		int num = 10;

		num>>=2;
                System.out.println(num);//2

                num<<=3;
                System.out.println(num);//16

                num ^= 2;
                System.out.println(num);//18

                num = ++num;
                System.out.println(num);//19

                num = --num;
                System.out.println(num);//18

    

        }

}
