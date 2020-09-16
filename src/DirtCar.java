public class DirtCar extends Car {
    //Super Keyword! -> referring -> parent -> Car


    public DirtCar(double mileage, int price, int seats, int dirtyTerrainTopSpeed) {
        super(mileage, price, seats);
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    private int dirtyTerrainTopSpeed;

    public int getDirtyTerrainTopSpeed() {
        return dirtyTerrainTopSpeed;
    }

    public void setDirtyTerrainTopSpeed(int dirtyTerrainTopSpeed) {
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;

    }

    public String startDirtCar (){
        return "Dirt car status is : "+super.carStart();
    }
}
