public class Home extends Building {
    private int bedroomCount;
    private String paintColor;

    public Home(int length, int width, int height, int roomCount, int bedroomCount, String paintColor){
        super(length, width, height, roomCount );
        this.bedroomCount = bedroomCount;
        this. paintColor = paintColor;
    }

    public void paint( String color) {
        System.out.println("ah fresh" + color + "paint");
    }
    public void addRooms () {
        this.bedroomCount++;
    }
    public void door(){
        System.out.println("Include a door");
        }




}



