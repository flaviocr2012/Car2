public class Main {
    public static void main(String[] args) {

        Car benz = new Car();
        benz.setMileage(20.36);
        benz.setPrice(50000);
        benz.setSeats(4);

        System.out.println("Benz has " + benz.getMileage());
        System.out.println("Benz is priced at " + benz.getPrice() + " dollars");
        System.out.println("Benz has " + benz.getSeats() + " seats");

    }
}
