public class Person {

    private String name;
    private String surname;
    private int age;

    public Person() {
        name = "John";
        surname = "Dow";
        age = 18;
    }

    public Person(String name, String surname, int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age can not be less 0 or more 150");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
