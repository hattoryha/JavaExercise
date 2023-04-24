package entity;

public class SaleOfficer extends Employee {
    private double commission;
    public SaleOfficer(String name, double salary, double commission) {
        super(name, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculateIncome() {
        return commission+salary;
    }

    @Override
    public String toString() {
        return "SaleOfficer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", commission=" + commission +
                '}';
    }
}
