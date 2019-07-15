public class Cat {
    private String color;
    private boolean isHungry;
    private int age;

    public Cat(String color, boolean isHungry, int age){
        this.color = color;
        this.isHungry = isHungry;
        this.age = age;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean getisHungry(){
        return this.isHungry;
    }
    public void setHungry(boolean isHungry){
        this.isHungry = isHungry;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }


}
