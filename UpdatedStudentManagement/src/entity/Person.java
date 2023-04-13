package entity;

public abstract class Person {
    private int id;
    private static int autoId;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
