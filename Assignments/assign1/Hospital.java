class Apollo {

   static int noOfDoctors = 500;
          int noOfPatients = 50000;

   static void displayDoctors(){

      System.out.println("Number of doctors in Apollo = " + noOfDoctors);

    }

    void displayPatients(){

      System.out.println("Number of patients in Apollo = " + noOfPatients);

    }

}

class AIIMS {

   static int noOfDoctors = 1200;
          int noOfPatients = 100000;

   static void displayDoctors(){

      System.out.println("Number of doctors in AIIMS = " + noOfDoctors);

    }

    void displayPatients(){

      System.out.println("Number of patients in AIIMS = " + noOfPatients);

    }

}


class Hospital {

    public static void main(String[] args){

      Apollo pune = new Apollo();
      pune.noOfPatients = 1200;
      pune.displayDoctors();
      pune.displayPatients();

      Apollo mumbai = new Apollo();
      mumbai.noOfPatients = 800;
      mumbai.displayDoctors();
      mumbai.displayPatients();

      AIIMS delhi = new AIIMS();
      delhi.noOfPatients = 5000;
      delhi.displayDoctors();
      delhi.displayPatients();

      AIIMS nagpur = new AIIMS();
      nagpur.noOfPatients = 700;
      nagpur.displayDoctors();
      nagpur.displayPatients();

    }
 
}




