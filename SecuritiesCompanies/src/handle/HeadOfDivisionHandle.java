package handle;

import entity.Employee;
import entity.HeadOfDivision;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadOfDivisionHandle {
    public HeadOfDivision createHeadOfDivision(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter salary");
        long salary = Long.parseLong(scanner.nextLine());
        System.out.println("Enter additionnalIncome");
        long additionnalIncome = Long.parseLong(scanner.nextLine());
        return new HeadOfDivision(name, salary,additionnalIncome);
    }
    public void addHeadOfDivision(Scanner scanner, ArrayList<Employee> employees){
        employees.add(createHeadOfDivision(scanner));
    }
}
