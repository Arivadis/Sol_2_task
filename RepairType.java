public class RepairType {

    private Employee master;
    private String whatBroken;
    private String comments;

    public RepairType() {

    }

    public Employee getMaster() {
        return master;
    }

    public void setMaster(Employee master) {
        this.master = master;
    }

    public String getWhatBroken() {
        return whatBroken;
    }

    public void setWhatBroken(String whatBroken) {
        this.whatBroken = whatBroken;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
