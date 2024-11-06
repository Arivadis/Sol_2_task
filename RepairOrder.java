import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class RepairOrder {

    private final int repairId;
    private final LocalDateTime orderDay;
    private LocalDateTime repairedDay;
    private Customer customer;
    private Device device;
    private RepairType repairType;
    private BigDecimal estimateCost = BigDecimal.ZERO;
    private DeliverOrder deliverOrder;
    private List<PartsOrder> partsOrders;

    public RepairOrder(int repairId) {
        this.repairId = repairId;
        orderDay = LocalDateTime.now();
    }

    public int getRepairId() {
        return repairId;
    }

    public LocalDateTime getOrderDay() {
        return orderDay;
    }

    public LocalDateTime getRepairedDay() {
        return repairedDay;
    }

    public void setRepairedDay(LocalDateTime repairedDay) {
        this.repairedDay = repairedDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public RepairType getRepairType() {
        return repairType;
    }

    public void setRepairType(RepairType repairType) {
        this.repairType = repairType;
    }

    public BigDecimal getEstimateCost() {
        return estimateCost;
    }

    public void setEstimateCost(BigDecimal estimateCost) {
        this.estimateCost = estimateCost;
    }

    public DeliverOrder getDeliverOrder() {
        return deliverOrder;
    }

    public void setDeliverOrder(DeliverOrder deliverOrder) {
        this.deliverOrder = deliverOrder;
    }

    public List<PartsOrder> getPartsOrders() {
        return partsOrders;
    }

    public void addPartsOrder(PartsOrder partsOrder) {
        partsOrders.add(partsOrder);
    }
}
