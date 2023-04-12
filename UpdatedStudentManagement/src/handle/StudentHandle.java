package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student CreateStudent(Scanner scanner){
        System.out.println("moi ban nhap ten hoc vien");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap tuoi hoc vien");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("moi ban nhap hoc luc hoc vien");
        String learningCapacity = scanner.nextLine();
        return new Student(name, age,learningCapacity);
//        Student(String name, int age, String learningCapacity)
    }
}
