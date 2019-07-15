public class Main2 {
    public static void main(String[] args){
        Dog d1 = new Dog("poodle", 7, "brown");
        System.out.println(d1.getAge() +" "+ d1.getColor()+" "+ d1.getSpecies());

        Dog d2 = new Dog(7);
        System.out.println(d2.getAge());

        Dog d3 = new Dog( "red", 25);
        System.out.println(d3.getColor()+ " "+ d3.getAge());

        Dog d4 = new Dog("lab");
        System.out.println(d4.getSpecies());
    }

}
