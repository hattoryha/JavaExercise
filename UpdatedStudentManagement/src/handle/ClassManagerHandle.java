package handle;



import entity.ClassManager;

import java.util.Scanner;

public class ClassManagerHandle {
    public ClassManager CreateClassManager(Scanner scanner){
        System.out.println("moi ban nhap ten quan ly lop");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap tuoi quan ly");
        int age = Integer.parseInt(scanner.nextLine());
        return new ClassManager(name, age);
//        ClassManager(String name, int age, String learningCapacity)
    }

}
