import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String name = "Desaree";
        Scanner scanner = new Scanner(System.in);
        Integer age = scanner.nextInt();
        Boolean isOver21 = age>21;
        System.out.println( "Desaree is over twenty-one?" + isOver21);



    }
}
