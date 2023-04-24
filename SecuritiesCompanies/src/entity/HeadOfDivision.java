package entity;

public class HeadOfDivision extends Employee {
    private double additionalIncome;

    public HeadOfDivision(String name, double salary, double additionalIncome) {
        super(name, salary);
        this.additionalIncome = additionalIncome;
    }


    @Override
    public double calculateIncome() {
        return salary+additionalIncome;
    }

    @Override
    public String toString() {
        return "HeadOfDivision{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", additionalIncome=" + additionalIncome +
                '}';
    }
}
