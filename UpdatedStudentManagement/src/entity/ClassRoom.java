package entity;

import java.util.ArrayList;

public class ClassRoom {
    private String subject;
    static ArrayList <Student> students;
    public ClassRoom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public static void setStudents(ArrayList<Student> students) {
        ClassRoom.students = students;
    }
}
