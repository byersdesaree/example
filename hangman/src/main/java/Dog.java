public class Dog {
    private String species;
    private int age;
    private String color;

    public String getSpecies(){
        return this.species;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Dog(String species, int age, String color){
        this.species = species;
        this.age = age;
        this.color = color;
    }
    public Dog(String species){
        this.species = species;
    }
    public Dog(String color, int age){
        this.color = color;
        this.age = age;
    }
    public Dog(int age){
        this.age = age;
    }
}
