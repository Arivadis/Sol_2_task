public class IdGenerator {
    private int idCount = 0;
    private int custIdCount = 0;
    private int repairId = 0;
    private int partsOrder = 0;

    public int newEmpId(int year) {
        return Integer.parseInt(year + String.valueOf(++idCount));
    }

    public int newCustId(int year) {
        return Integer.parseInt(year + "00000" + ++custIdCount);
    }

    public int repairOrdId(int custId) {
        return Integer.parseInt(String.valueOf(custId) + ++repairId);
    }

    public int partsOrdId(int repOrdId) {
        return Integer.parseInt(String.valueOf(repOrdId) + ++partsOrder);
    }
}
