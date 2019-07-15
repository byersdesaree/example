public  abstract class Vehicle {
    private int milesTraveled;
    private String make;
    private String model;
    private String year;

    public int getMilesTraveled(){
        return this.milesTraveled;
    }
    public void setMilesTraveled(int milesTraveled){
        this.milesTraveled = milesTraveled;
    }

    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getYear(){
        return this.year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public abstract void drive(int miles);

    public abstract void displayMilesTraveled();
}
