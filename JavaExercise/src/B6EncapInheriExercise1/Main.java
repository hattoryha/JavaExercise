package B6EncapInheriExercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap chieu rong hinh chu nhat");
        double width = scanner.nextInt();
        System.out.println("Nhap chieu dai hinh chu nhat");
        double length = scanner.nextInt();
        System.out.println("Nhap canh hinh vuong");
        double side = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width,length);
        System.out.println("dt hinh chu nhat: " +rectangle.area()+ " va chu vi hinh chu nhat la: " + rectangle.perimeter());
        System.out.println(rectangle.toString());
        Square square = new Square(side);
        System.out.println("dt hinh vuong: " +square.area()+ " va chu vi hinh vuong la: " + square.perimeter());
        System.out.println(square.toString());


    }
}
