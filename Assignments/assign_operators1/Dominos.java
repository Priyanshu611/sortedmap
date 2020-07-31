class Dominos {

           int price = 0, quantity = 0;//instance variables
    static int total;//static variable

    static void bill(){

           System.out.println("Total amount is " + total);

    }

    public static void main(String[] args){

            Dominos pizza = new Dominos(); //first object
            pizza.price = 370;
            pizza.quantity = 3;

            Dominos fries = new Dominos(); //second object
            fries.price = 80;
            fries.quantity = 3;

            Dominos.total = (pizza.price * pizza.quantity) + (fries.price * fries.quantity);//calculating bill
            Dominos.bill();

    }

}
