import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Animal a1 = new Animal();

        a1.setType("");
        System.out.println(a1.getType());

        String setType = scanner.nextLine();

        a1.setAge(22);
        System.out.println(a1.getAge());
        a1.speak();
    }
}

