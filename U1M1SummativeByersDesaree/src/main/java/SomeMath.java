public class SomeMath {
    public static void main(String[] args) {
        total5(1,2,3,4,5);
        System.out.println(total5(1,2,3,4,5));

        average5(1,3,5,7,9);
        System.out.println(average5(1,3,5,7,9));

        largest5(42.0, 35.1,2.3,40.2,15.6);
        System.out.println(largest5(42.0, 35.1,2.3,40.2,15.6));
    }
    public static int total5(int num1, int num2, int num3, int num4, int num5) {
        return (num1 + num2 + num3 + num4 + num5);
    }

    public static double average5(int num1, int num2, int num3, int num4, int num5) {
        return ((num1 + num2 + num3 + num4 +num5)/2);
    }
    public static double largest5(double a, double b, double c, double d, double e){
        if (a>b && a>c && a>d && a>e) {
            return a;
        }
        if (b>a && b>c && b>d && b>e){
            return b;
        }
        if (c>a && c>b && c>d && c>e){
            return c;
        }
        if (d>a && d>b && d>c && d>e){
            return d;
        }
        else {
            return e;
        }
    }
}
