public class Radio {
    private String manufacturer;
    private String model;
    private int numSpeaker;
    private String station;
    private int volume;
    private boolean powered;

    public String getManufacturer(){
        return this.manufacturer;
    }
    public String getModel(){
        return this.model;
    }
    public int getNumSpeaker(){
        return this.numSpeaker;
    }
    public String getStation(){
        return this.station;
    }
    public int getVolume(){
        return this.volume;
    }
    public boolean getPowered(){
        return this.powered;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setNumSpeaker(int numSpeaker){
        this.numSpeaker = numSpeaker;
    }
    public void setStation(String station){
        this.station = station;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setPowered(boolean powered){
        this.powered = powered;
    }

    public Radio(String maufacturer, String model, int numSpeaker, String station, int volume, boolean powered){
        this.manufacturer= manufacturer;
        this.model = model;
        this. numSpeaker = numSpeaker;
        this. station = station;
        this. volume = volume;
        this.powered = powered;
    }

}
