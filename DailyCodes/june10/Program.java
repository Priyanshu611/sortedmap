

class IntegerDatatype {

   public static void main(String[] args){

       byte range = 127; // range of byte is -128 to 127
       short x = 32767;// range of short is
       System.out.println("Range of byte =" + range);
       range++; // -128 as it does wrapping
       System.out.println("Range of byte =" + range);
       range++;
       System.out.println("Range of byte =" + range);//-127

       // for short datatype
       System.out.println("Range of short =" + x);// 32767
       ++x; // 
       System.out.println("Range of short =" + x);//-32768
       ++x;
       System.out.println("Range of short =" + x);//-32767
    }

}
