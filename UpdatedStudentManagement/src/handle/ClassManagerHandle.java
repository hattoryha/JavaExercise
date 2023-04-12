package handle;



import entity.ClassManager;

import java.util.Scanner;

public class ClassManagerHandle {
    public ClassManager CreateClassManager(Scanner scanner){
        System.out.println("moi ban nhap ten giao vien");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap tuoi giao vien");
        int age = Integer.parseInt(scanner.nextLine());
        return new ClassManager(name, age);
//        ClassManager(String name, int age, String learningCapacity)
    }

}
