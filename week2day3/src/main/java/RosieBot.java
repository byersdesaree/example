public class RosieBot implements Robot {
    private int rosieCount;

    private static int rosieCOunt(int num) {
        return ++num;
    }
        public boolean turnOn(){
            System.out.println("Turn off");
            return true;
        }
        public boolean turnOff(){
        System.out.println("Turn Off");
        return false;
        }

}
