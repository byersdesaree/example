public class ArrayL implements List {
    public static String arr[] = new String[10];
    private int listSize;
    ArrayL(){}

     ArrayL(String[] arr, int listSize){
        this.arr = arr;
        this.listSize = listSize;
    }

    public String[] getArr(){
        return this.arr;
    }
    public void setArr(String[] arr){
        this.arr = arr;
    }

    public int getListSize(){
        return this.listSize;
    }
    public void setListSize(int listSize){
        this.listSize = listSize;
    }





}
