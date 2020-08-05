class Capgemini {

   static int noOfEmp = 200000;
          int projectCount = 200;

   void displayProject(){

      System.out.println("Capgemini project Count = " + projectCount);

   }

    static void empInfo(){

      System.out.println("Capgemini total employees = " + noOfEmp);

   }

}


class TCS {

   static int noOfEmp = 500000;
          int projectCount = 350;

   void displayProject(){

      System.out.println("TCS project Count = " + projectCount);

   }

    static void empInfo(){

      System.out.println("TCS total employees = " + noOfEmp);

   }

}

class ITCompanies {

    public static void main(String[] args){

      Capgemini pune = new Capgemini();
      pune.projectCount = 130;
      pune.displayProject();
      pune.empInfo();

      Capgemini chennai = new Capgemini();
      chennai.projectCount = 70;
      chennai.displayProject();
      chennai.empInfo();

      TCS mumbai = new TCS();
      mumbai.projectCount = 200;
      mumbai.displayProject();
      mumbai.empInfo();

      TCS bangalore = new TCS();
      bangalore.projectCount = 150;
      bangalore.displayProject();
      bangalore.empInfo();

    }
 
}




