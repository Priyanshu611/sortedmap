import java.lang.*;


class Program{

   Program(){
      
     // first line of constructor is super()
     System.out.println("In construtor");

   }

   public static void main(String[] args){

 
    Program obj = new Program(); // constructor can only be called by creating object
    System.out.println("In main");
   
   }
}

