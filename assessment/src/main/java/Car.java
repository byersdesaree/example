public abstract class Car {
    private double topSpeed;
    private double currentSpeed;
    private String color;

    public Car(String color, double topSpeed){
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed(){
        return this.topSpeed;
    }
    public void setTopSpeed(double topSpeed){
        this.topSpeed = topSpeed;
    }
    public double getCurrentSpeed(){
        return this.currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = 0;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public abstract void accelerate();
}
