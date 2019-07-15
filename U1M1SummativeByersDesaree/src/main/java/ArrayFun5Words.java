import java.util.Scanner;
public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 words");

        String word1= scanner.nextLine();
        String word2= scanner.nextLine();
        String word3= scanner.nextLine();
        String word4= scanner.nextLine();
        String word5= scanner.nextLine();

        String[] words = {word1, word2, word3, word4, word5};

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);

    }
}
