import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNum = 4;
        Integer input = scanner.nextInt();
        Boolean isTrue = input>=magicNum;
        System.out.println(isTrue);
    }
}
