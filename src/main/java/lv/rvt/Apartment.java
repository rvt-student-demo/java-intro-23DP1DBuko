package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (compared.getSquares() <= this.getSquares()) {
            return true;
        } 
        return false;
    }
    public int getSquares() {
        return this.squares;
    }
}
