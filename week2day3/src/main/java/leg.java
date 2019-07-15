public class leg {
    private String state;

    public void setState(String state){
        switch(state){
            case "walking":
            case "Stretching":
            case"Running":
            case "Jumping":
            case "sitting":
                this.state = state;
                break;
            default:
                this.state = "walking";}
    }

    public String setState() {
        return this.state;
    }
}
