package entity;

public class AdminOfficer extends Employee{

    public AdminOfficer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateIncome() {
        return salary;
    }

    @Override
    public String toString() {
        return "AdminOfficer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
