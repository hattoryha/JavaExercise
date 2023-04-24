package handle;

import entity.AdminOfficer;
import entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminOfficerHandle {
    public AdminOfficer createAdminOfficer(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter salary");
        long salary = Long.parseLong(scanner.nextLine());
        return new AdminOfficer(name, salary);
    }
    public void addAdminOfficer(Scanner scanner, ArrayList<Employee> employees){
        employees.add(createAdminOfficer(scanner));
    }


}
