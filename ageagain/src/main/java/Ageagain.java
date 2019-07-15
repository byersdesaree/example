import java.util.Scanner;

public class Ageagain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 14) {

            System.out.println("What grade are you in?");
            Scanner gradescan = new Scanner(System.in);
            int grade = gradescan.nextInt();
            System.out.println("Wow" + grade + "grade-that sounds exciting!");
        } if (age >= 14 && age <= 18){
                System.out.println("Are you planning to go to college?");
                Scanner yesOrno =new Scanner(System.in);
                String answer = yesOrno.nextLine();
            if (answer == "yes"){
                    System.out.println("What college?");
                    Scanner collegescan = new Scanner(System.in);
                    String answer2 = collegescan.nextLine();
                    System.out.println(answer2 +"is a great school!");
                if (answer == "no") {
                    System.out.println("What do you want to do after highschool?");
                    Scanner noscan = new Scanner(System.in);
                    String answer3 = noscan.nextLine();
                    System.out.println("Wow" + answer3 + "sounds like a plan!");
                }if (age >18) {
                System.out.println("What is your job?");
                Scanner jobscan = new Scanner(System.in);
                String job = jobscan.nextLine();
                System.out.println(job +"sounds like a great job");
                        }

                    }
                }
            }

        }




