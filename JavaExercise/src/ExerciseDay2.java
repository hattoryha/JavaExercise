import java.awt.*;
import java.util.Scanner;

public class ExerciseDay2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name ;
        String address;
        int age;
        String continueOrNot;
        do{
            System.out.println("Please input name of a student");
            name = sc.nextLine();
            System.out.println("Please input address of a student");
            address = sc.nextLine();
            System.out.println("Please input age of a student");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("all information of the student:");
            System.out.println("name: "+name);
            System.out.println("address: " + address);
            System.out.println("all information of the student: " + age);
            System.out.println("Do you want to continues?(Y/N)");
            continueOrNot = sc.nextLine();
        }
        while (continueOrNot.equals("y"));
//        int age = Integer.parseInt(sc.nextLine());
//        String test = sc.nextLine();
//        System.out.println(name + address+age+test);

    }
}
