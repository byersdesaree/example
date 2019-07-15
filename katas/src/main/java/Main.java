public class Main {
    public static void main(String[] args){
        Book num1 = new Book("doves", "Mary Jo", true);
        System.out.println(num1.getTitle()+ " "+ num1.getAuthor()+ " "+ num1.getisCheckedOut());

        Book num2 = new Book("birds", "Jo Mary", false);
        System.out.println(num2.getTitle()+" "+ num2.getAuthor()+ " " + num2.getisCheckedOut());
    }
}
