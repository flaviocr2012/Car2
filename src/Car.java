public class Car {
    //mileage, price, seats count

    double mileage;
    int price;
    int seats;

    // constructors - special method - create objects - implicitly called.

    //this -> reference to whoever is using it.
    //class that using the "this" keyword.

    public Car(double mileages, int prices, int seats) {
        this.mileage = mileages; //set class's field mileage to be equal to mileage from method.
        this.price = prices;
        this.seats = seats;

    }

    // Creating methods

    public void carStart() {
        System.out.println("Car Started");
    }

    public void carShuttOff() {
        System.out.println("Car Engine off");
    }

}
