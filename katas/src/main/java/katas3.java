public class katas3 {
    public static void main(String[] args){

        int diff2 = subtractOrZero (7,4);
        System.out.println(diff2);

        int num1 = max(1,2,3);
        System.out.println(num1);

        int min1 = min(5,33,54);
        System.out.println(min1);
    }
    public static int subtractOrZero(int a, int b){
        int zero = 0;
        if ((b-a)>= 0){
            return b-a;}
            else {
                return 0;
            }
        }

    public static int max(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        }
        if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static int min(int a, int b, int c){
        if (a<b && a<c){
            return a;
        }
        if (b<a && b<c){
            return b;
        }
        else {
            return c;
        }
    }
    }

