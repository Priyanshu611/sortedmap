class TataFoundation {

   static int noOfCities = 200;
          int socalActivities = 3000;

   void displayCities(){

      System.out.println("Tata Foundation acitivity count = " + socalActivities);

   }

    static void cityInfo(){

      System.out.println("Tata Foundation active in = " + noOfCities + " cities");

   }

}


class RelianceFoundation {

   static int noOfCities = 100;
          int socalActivities = 1500;

   void displayCities(){

      System.out.println("Reliance Foundation acitivity count = " + socalActivities);

   }

    static void cityInfo(){

      System.out.println("Reliance Foundation active in = " + noOfCities + " cities");

   }

}

class CharityTrusts {

    public static void main(String[] args){

      TataFoundation jharkhand = new TataFoundation();
      jharkhand.socalActivities = 100;
      jharkhand.displayCities();
      jharkhand.cityInfo();

      TataFoundation uttarakhand = new TataFoundation();
      uttarakhand.socalActivities = 150;
      uttarakhand.displayCities();
      uttarakhand.cityInfo();

      RelianceFoundation bihar = new RelianceFoundation();
      bihar.socalActivities = 20;
      bihar.displayCities();
      bihar.cityInfo();

      RelianceFoundation gujarat = new RelianceFoundation();
      gujarat.socalActivities = 70;
      gujarat.displayCities();
      gujarat.cityInfo();

    }
 
}




