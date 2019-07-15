public abstract class Car extends Vehicle {
    private int numDoors;
    private boolean poweredWindows;

    public Car(int milesTraveled, String make, String model, String year, int numDoors, boolean poweredWindows){
        this.numDoors = numDoors;
        this.poweredWindows = poweredWindows;
    }
    public int getNumDoors(){
        return this.numDoors;
    }
    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }
    public boolean getPoweredWindows(){
        return this.poweredWindows;
    }
    public void setPoweredWindows(boolean poweredWindows){
        this.poweredWindows = poweredWindows;
    }

    public abstract void lockDoors();

    public abstract void honk();

    public void drive(int miles){
        System.out.println("mile");
    }
    public void displayMilesTraveled(){
        System.out.println("miles total");
    }
}
