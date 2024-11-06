import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PartsOrder {

    private int orderId;
    private String warehouse;
    private BigDecimal cost;
    private final List<String> parts = new ArrayList<>();

    public PartsOrder() {

    }

    public PartsOrder(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public List<String> getParts() {
        return parts;
    }

    public void addParts(String part) {
        parts.add(part);
    }

    public void removePart(int partIndex) {
        parts.remove(partIndex);
    }
}
