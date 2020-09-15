public class Main {
    public static void main(String[] args) {
        Car benz = new Car (13.45, 40000, 3);

        System.out.println("The mileage being "+ benz.mileage);
        System.out.println("Benz is priced at " + benz.price + " dollars");
        System.out.println("Benz has "+ benz.seats + " seats");

        benz.carStart();
        benz.carShuttOff();

    }
}
