package B7AbstractInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ten hoc vien: ");
        String name = scanner.nextLine();
        ITStudent itStudent = new ITStudent(name);
        System.out.println("nhap diem java cua hoc vien: ");
        double javaPoint = Double.parseDouble(scanner.nextLine());
        itStudent.setJavaPoint(javaPoint);
        System.out.println("nhap diem css cua hoc vien: ");
        double cssPoint = Double.parseDouble(scanner.nextLine());
        itStudent.setCssPoint(cssPoint);
        System.out.println("nhap diem html cua hoc vien: ");
        double htmlPoint = Double.parseDouble(scanner.nextLine());
        itStudent.setHtmlPoint(htmlPoint);
        System.out.println(itStudent.print());

    }
}
