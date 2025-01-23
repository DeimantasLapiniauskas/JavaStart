
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment another){
        return another.squares < this.squares;
    }

    public int priceDifference (Apartment compared){
        return this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
    }

}
