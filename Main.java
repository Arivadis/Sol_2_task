public class Main {
    public static void main(String[] args) {

        IdGenerator idGenerator = new IdGenerator();
        Person person1 = new Person("Evander", "Holyfield", 55);
        Person person2 = new Person("Holly", "Molly", 35);
        Person person3 = new Person("Barbara", "Streisand", 66);


        Employee employee1 = new Employee(idGenerator.newEmpId(2024), person1, JobPosition.DELIVERY);
        Employee employee2 = new Employee(idGenerator.newEmpId(2024), person1, JobPosition.ACCOUNTANT);
        Employee employee3 = new Employee(idGenerator.newEmpId(2023), person1, JobPosition.TEAMLEAD);

        RepairService repairService = new RepairService("VegaRep", "SmartPhone", employee3);
        repairService.addEmployee(employee1);
        repairService.addEmployee(employee2);
        repairService.removeEmployee(employee1);
        System.out.println(repairService);
    }
}
