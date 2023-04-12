package entity;

public class Pupil {
    private static int autoId;
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classRoom;

    public Pupil(int id, String name, int age, String address, double point, String classRoom) {
        this.id = autoId++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classRoom = classRoom;
    }

}
