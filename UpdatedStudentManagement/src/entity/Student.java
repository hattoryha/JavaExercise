package entity;

public class Student extends Person{
    private String learningCapacity;

    public Student(String name, int age, String learningCapacity) {
        super(name, age);
        this.learningCapacity = learningCapacity;
    }
}
