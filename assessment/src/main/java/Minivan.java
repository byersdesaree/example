public class Minivan extends Car{
    public Minivan(String color, double topSpeed){
        super (color, topSpeed);
    }

    public void accelerate(){
        this.setCurrentSpeed(getTopSpeed()*.05);
    }
}
