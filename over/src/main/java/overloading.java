public class overloading {
    public static void main(String[] args){

    }
    public static boolean validateInput(String input){
        return input.length()>8;
    }
    public static boolean validateInput(int num){
        return num > 9999 && num < 100000;
    }

}
