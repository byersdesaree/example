import java.util.Scanner;

public class HiLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        if (integer > 10) {
            System.out.println("Hi");

        } else {
            System.out.println("Low");
        }


    }}