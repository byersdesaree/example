
public class demo {
    public static void main (String args[]){
        int normalNum = 2;
        double weirdNum = 3.2;

        System.out.println("The normal number is " + normalNum); //what will print at println #1?
        System.out.println("The weird number is " + weirdNum); //what will print at println #2?

        double sum = normalNum + weirdNum;
        System.out.println("The sum is " + sum); //what will print at println #3?

        double product = normalNum * normalNum;
        System.out.println("The product is " + product); //what will print at println #4?

        sum = 5;
        System.out.println("The sum is " + sum); //what will print at println #5?

        int remainder = 5 % normalNum;
        System.out.println("The remainder is " + remainder); //what will print at println #6?
    }
}