class People{

  public static void main(String[] args){

   // calling the below method using static object created in other class
   CentralGovernment.obj.StateDecisions();

   // making object of 1st class for calling instance obj made in Goverment class
   CentralGovernment abc = new CentralGovernment();
   abc.obj1.StateDecisions(); // calling this method in diff way

  }



}
