import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RepairOrder {

    private final int id;
    private final LocalDateTime orderDay;
    private LocalDateTime repairedDay;
    private Customer customer;
    private Device device;
    private RepairType repairType;
    private BigDecimal estimateCost = BigDecimal.ZERO;
    private DeliverOrder deliverOrder;
    private final List<PartsOrder> partsOrders;
    private boolean isComplete;

    public RepairOrder(int repairId) {
        this.id = repairId;
        orderDay = LocalDateTime.now();
        partsOrders = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete() {
        isComplete = !isComplete;
    }

    public void doRepair(Employee master) {
        System.out.println(master + "is working on the device");
    }

    public void orderingParts(int orderId) {
        System.out.println("Ordering parts for ID" + orderId);
    }

}
