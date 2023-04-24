package handle;

import entity.AdminOfficer;
import entity.Employee;
import entity.HeadOfDivision;
import entity.SaleOfficer;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeHandle {
    public  int employeeTypeChecker (Employee employee) {

            if (employee instanceof SaleOfficer) {
                System.out.println(employee + " là kiểu dữ liệu SaleOfficer.");
                return 1;
            } else if (employee instanceof AdminOfficer) {
                System.out.println(employee + " là kiểu dữ liệu AdminOfficer.");
                return 2;
            } else if (employee instanceof HeadOfDivision) {
                System.out.println(employee + " là kiểu dữ liệu Double.");
                return 3;
            }else {
                System.out.println(employee + " là kiểu dữ liệu không xác định.");
                return 0;
            }

        }
    public  Employee findEmployeeById (Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("Enter Id: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (Employee e:employees
             ) {
            if(e.getId()==id) return e;
            else System.out.println("can not find");;
        }
        return null;
    }
    public void removeEmployeeById (Scanner scanner, ArrayList<Employee> employees){
        Employee employee=findEmployeeById (scanner,  employees);
        employees.remove(employee);
    }
    public void modifyEmployeeById (Scanner scanner, ArrayList<Employee> employees){
        Employee employee=findEmployeeById (scanner,  employees);
        HeadOfDivisionHandle headOfDivisionHandle = new HeadOfDivisionHandle();
        AdminOfficerHandle adminOfficerHandle = new AdminOfficerHandle();
        SaleOfficerHandle saleOfficerHandle =new SaleOfficerHandle();
        if(employeeTypeChecker(employee)==1){
            SaleOfficer saleOfficer = saleOfficerHandle.createSaleOfficer(scanner);
            saleOfficer.setId(employee.getId());
            employees.remove(employee);
            saleOfficerHandle.addSaleOfficer(scanner,employees);
        } else if(employeeTypeChecker(employee)==1){
            AdminOfficer adminOfficer = adminOfficerHandle.createAdminOfficer(scanner);
            adminOfficer.setId(employee.getId());
            employees.remove(employee);
            adminOfficerHandle.addAdminOfficer(scanner,employees);
        }else {
            HeadOfDivision headOfDivision = headOfDivisionHandle.createHeadOfDivision(scanner);
            headOfDivision.setId(employee.getId());
            employees.remove(employee);
            headOfDivisionHandle.addHeadOfDivision(scanner,employees);
        }
    }
    public  ArrayList<Employee> findEmployeeBySalary (Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("Enter the range of employee's salary: ");
        System.out.println("upper limit:");
        double upperLimit = Double.parseDouble(scanner.nextLine());
        System.out.println("bottom limit:");
        double bottomLimit = Double.parseDouble(scanner.nextLine());
        ArrayList<Employee> findOutEmployees =new ArrayList<>();
        for (Employee e:employees
        ) {
            if(e.getSalary()>bottomLimit&e.getSalary()<upperLimit) findOutEmployees.add(e);
        }
        return findOutEmployees;
    }

}
