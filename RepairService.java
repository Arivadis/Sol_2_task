import java.util.ArrayList;
import java.util.List;

public class RepairService {

    private String name;
    private final List<Employee> employes;
    private String profile;
    private Employee teamLead;
    private final List<RepairOrder> repairOrders;
    private int totalRepaired;

    public RepairService() {
        employes = new ArrayList<>();
        repairOrders = new ArrayList<>();
    }

    public RepairService(String name, String profile) {
        this.name = name;
        this.profile = profile;
        employes = new ArrayList<>();
        repairOrders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployes() {
        return employes;
    }

    public void addEmployee(Employee employee) {
        employes.add(employee);
    }

    public void removeEmployee(Employee employee) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getId() == employee.getId()) {
                employes.remove(i);
                break;
            }
        }
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public List<RepairOrder> getRepairOrders() {
        return repairOrders;
    }

    public void addRepairOrder(RepairOrder repairOrder) {
        repairOrders.add(repairOrder);
    }

    public int getTotalRepaired() {
        return totalRepaired;
    }

    public void addRepairedCount() {
        totalRepaired++;
    }
}
