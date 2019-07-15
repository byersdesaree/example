public class student {
    private int dormroom;
    private int classcount;
    private boolean isEnrolled;


    public int getDormroom() {
        return this.dormroom;
    }

    public void setDormroom(int num) {
        if (num > 0) {
            this.dormroom = num;
        }
    }

    public void unregister(int count) {
        this.classcount--;
        if (count < 1 & count >0) {
            this.isEnrolled = false;
        }
    }
}