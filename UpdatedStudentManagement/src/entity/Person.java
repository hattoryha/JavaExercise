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
}
