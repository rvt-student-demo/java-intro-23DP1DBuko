package lv.rvt;

// camelCase
// PascalCase

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Automatically created  constructor method by Java
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct() {
        // Banana, price 1.1, 13 pcs
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + "pcs");
    }
}

