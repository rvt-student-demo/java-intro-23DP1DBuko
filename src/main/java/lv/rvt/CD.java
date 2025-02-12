package lv.rvt;

public class CD implements Packable{
    private String author;
    private String name;
    private int date;
    
    public CD(String author, String name, int date) {
        this.author = author;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name + " (" + this.date + ")";
    }
    
    public double weight(){
        return 0.1;
    }

}
