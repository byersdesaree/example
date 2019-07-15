public class Motorcycle extends Vehicle{
    private int cubicCentimeters;

    public int getCubicCentimeters(){
        return this.cubicCentimeters;
    }
    public void setCubicCentimeters(int cubicCentimeters){
        this.cubicCentimeters = cubicCentimeters;
    }

    public boolean isRunning(){
        System.out.println("is True");
        return true;
    }

    public void repair(){
        System.out.println("repair");
    }

    public void drive(int miles){
        System.out.println("mile");
    }
    public void displayMilesTraveled(){
        System.out.println("miles total");
    }
}
