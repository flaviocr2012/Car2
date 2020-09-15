public class Main {
    public static void main(String[] args) {
        Car benz = new Car();
        benz.mileage = 11.45;
        benz.price = 35000;
        benz.seats = 5;

        System.out.println("The mileage being "+ benz.mileage);
        System.out.println("Benz is priced at " + benz.price + " dollars");
        System.out.println("Benz has "+ benz.seats + " seats");

        benz.carStart();
        benz.carShuttOff();

    }
}
