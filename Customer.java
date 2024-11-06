public class Customer {

    private int id;
    private Person person;
    private String device;

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public void setName(Person person) {
        this.person = person;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
