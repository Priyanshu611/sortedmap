class Store{

    // instance variable
    int list = 0;
    int bag = 0;

    // static variable
    static String counter = "Open";
    
    // static method
    static void Store_timing(){

      System.out.println("Stroe timing is 9am to 10 pm");
    }

    // instance method
    void Person_1(){

      System.out.println("My list is = " + list);
      System.out.println("I have " + bag + " bag");  
      System.out.println("The counter is = " + counter);

    }

    // instance method
    void Person_2(){

      System.out.println("My list is = " + list);
      System.out.println("I have " + bag + " bag");  
      System.out.println("The counter is = " + counter);

    }

}

class Order{

   public static void main(String[] args){

     // calling static method of store class 
     Store.counter = "Close";
     Store.Store_timing();

    // calling instance method of store class
    Store obj = new Store();
    obj.list = 1;
    obj.Person_1();

    Store obj1 = new Store();
    obj1.bag = 1;
    obj1.Person_2();

   }

}
