public class practice {
    public static void main(String args[]) {
       int year1= printYear(1984);
       System.out.println(year1);

       Boolean mystr= isDog("dog");
       System.out.println(mystr);
    }
    public static int printYear(int a){
        return 1984;
    }
    public static boolean isDog(String answer){
       if (answer.equals("dog")){
        return true;
    }
       else {
           return false;
       }
    }
}
