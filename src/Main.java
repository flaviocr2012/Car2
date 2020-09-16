public class Main {
    public static void main(String[] args) {

        Car benz = new Car();

        DirtCar dirtybenz = new DirtCar();
        dirtybenz.setMileage(8);
        dirtybenz.setPrice(35000);
        dirtybenz.setSeats(3);
        dirtybenz.setDirtyTerrainTopSpeed(60);

        System.out.println("Dirty Benz's mileage is: " + dirtybenz.getMileage());
        System.out.println("Dirty Benz's price is " + dirtybenz.getPrice() + " dollars");
        System.out.println("Dirty Benz's seats count " + dirtybenz.getSeats() + " seats");
        System.out.println("Dirty Benz's Terrain Top Speed is: " + (dirtybenz.getDirtyTerrainTopSpeed()));

        System.out.println(dirtybenz.startDirtCar());

//
//        benz.setMileage(20.36);
//        benz.setPrice(50000);
//        benz.setSeats(4);
//
//        System.out.println("Benz has " + benz.getMileage());
//        System.out.println("Benz is priced at " + benz.getPrice() + " dollars");
//        System.out.println("Benz has " + benz.getSeats() + " seats");

    }
}
