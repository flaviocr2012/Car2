public class DirtCar extends Car {
    //Super Keyword! -> referring -> parent -> Car


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
