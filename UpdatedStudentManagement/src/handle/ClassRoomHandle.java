package handle;

import entity.ClassRoom;
import entity.Student;
import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomHandle {
    public ClassRoom CreateClassRoom(Scanner scanner){
        System.out.println("moi ban nhap ten mon hoc cua class");
        String subject = scanner.nextLine();
        System.out.println("moi ban nhap so luong hoc vien");
        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle =new StudentHandle();
        ArrayList <Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            students.add(studentHandle.CreateStudent(scanner));
        }

        return new ClassRoom(subject,students);
    }
    public ClassRoom UpdateClassRoom(Scanner scanner){
        System.out.println("moi ban nhap so luong hoc vien muon them");
        int numberOfNewStudent = Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle =new StudentHandle();
        ArrayList <Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            students.add(studentHandle.CreateStudent(scanner));
        }

        return new ClassRoom(subject,students);
    }
}
