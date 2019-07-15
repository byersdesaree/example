public abstract class Building {
    private int length;
    private int width;
    private int height;
    private int roomCount;

    public abstract void door();

    public Building(int length, int width, int height,int roomCount ){
         this.length = length;
         this.width = width;
         this.height = height;
         this. roomCount = roomCount;

        }




    public void addRooms() {
        this.roomCount++;
    }
    public void paint() {
        System.out.println("ah fresh paint ");
        }



}

