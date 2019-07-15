public class Main {
    public static void main(String[] args){
        Cat c1 = new Cat("orange", false, 2);
        System.out.println(c1.getColor());
        System.out.println(c1.getisHungry());
        System.out.println(c1.getAge());

        c1.setHungry(true);
        System.out.println(c1.getisHungry());
    }


}
