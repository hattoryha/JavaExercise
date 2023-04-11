package B6EncapInheriExercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ten benh nhan: ");
        String name = scanner.nextLine();
        System.out.println("dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap tuoi benh nhan: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("SDT: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap so benh an: ");
        int medicalRecordNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("ngay nhap vien: ");
        String admissionDate = scanner.nextLine();
        Patient patient = new Patient(name,age,gender,address,phoneNumber, medicalRecordNumber, admissionDate);
        System.out.println(patient.toString());
    }
}