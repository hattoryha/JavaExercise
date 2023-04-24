package entity;

public abstract class Employee {
    private static int autoId;
    protected int id;
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.id = autoId++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateIncome();
    public double calculateTax(){
        return 0.1*(calculateIncome()-11_000_000);
    };


}
