package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
        history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }
}