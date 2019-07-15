import java.util.Scanner;

public class hangman {
   public static int numLife = 5;
   public static String[] words = {"Java", "SQL", "HTML"};

   public static void main(String[] args) {
       do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter letter");
           char guesses = scanner.next().charAt(0);

           char[] sqlArr = words[1].toCharArray();

           char letter0 = words[1].charAt(0);
           char letter1 = words[1].charAt(1);
           char letter2 = words[1].charAt(2);

           if (guesses == letter0) {
               System.out.println("correct");
           } else if (guesses == letter1) {
               System.out.println("correct");
           } else if (guesses == letter2) {
               System.out.println("correct");
           } else {
               System.out.println("incorrect");


               }
           }
        while (numLife > 0);
   }
}