public class CD implements Packable{

    private String artist;
    private String cdName;
    public int publishYear;
    private double weight = 0.1;

    public CD(String artist, String cdName, int publishYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publishYear = publishYear;
    }

    @Override
    public double weight() {
        return weight;
    }
    public String toString(){
        return artist + ": " + cdName + " (" + publishYear + ")";
    }
}
