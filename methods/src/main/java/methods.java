public class methods {
    public static void main(String[] args) {
        printNames();
        printNames();
        printNames();
        printNames();
        //We have to make sure that we call the method her so that it will run successfully below//
    }

    public static void printNames() {
        System.out.println("My name is Pat");
        System.out.println("Their name is Patsy");
        System.out.println("Her name is Pam");
        // function will run 4 time printNames()
    }

    // public static void main(String[] args)
    // { printNums();
    // }
    // Create a code that will print number 1-5 using a loop.
    public static void printNums() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    // public static void main(String[] args){
    int sum1 = add(1, 3  );
    int sum2 = add(a 3, b 7);

    System.out.println("sum1 is"+sum1);
    System.out.println("sum2 is"+sum2);
    //}

    public static int add(int a, int b){
        //int sum=a+b;
        return a + b;
    }
}
