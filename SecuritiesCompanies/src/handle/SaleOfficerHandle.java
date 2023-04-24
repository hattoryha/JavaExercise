package handle;

import entity.Employee;
import entity.SaleOfficer;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleOfficerHandle {
    public SaleOfficer createSaleOfficer(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter salary");
        long salary = Long.parseLong(scanner.nextLine());
        System.out.println("Enter commission");
        long commission = Long.parseLong(scanner.nextLine());
        return new SaleOfficer(name, salary,commission);
    }
    public void addSaleOfficer(Scanner scanner, ArrayList<Employee> employees){
        employees.add(createSaleOfficer(scanner));
    }
}
