public class Automobiles {
    private int numOfDoors;
    private boolean isOn;
    private String color;

    public Automobiles(int numOfDoors, String color){
        this.numOfDoors = numOfDoors;
        this.color = color;
    }


    public int getNumOfDoors(){
        return this.numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors){
        this.numOfDoors = numOfDoors;
    }

    public boolean getIsOn(){
        return this.isOn;
    }
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
