package handle;


import entity.Teacher;

import java.util.Scanner;

public class TeacherHandle {
    public Teacher CreateTeacher(Scanner scanner){
        System.out.println("moi ban nhap ten giao vien");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap tuoi giao vien");
        int age = Integer.parseInt(scanner.nextLine());
        return new Teacher(name, age);
//        Teacher(String name, int age, String learningCapacity)
    }
}
