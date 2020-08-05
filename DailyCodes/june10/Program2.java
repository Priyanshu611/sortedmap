

class FloatDatatype {

   public static void main(String[] args){

       float f = 20.6f; 
       System.out.println("Value of float = " + f);//20.5
       
       double d = 20.6;
       System.out.println("Value of double = " + d);// 20.5

       if(f == d)
               System.out.println("Same value");
       else
               System.out.println("Diff value");// this is true condition
    }

}
