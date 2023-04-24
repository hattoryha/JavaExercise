import entity.Employee;
import handle.AdminOfficerHandle;
import handle.EmployeeHandle;
import handle.HeadOfDivisionHandle;
import handle.SaleOfficerHandle;
import views.EmployeeListDisplay;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        EmployeeHandle employeeHandle =new EmployeeHandle();
        HeadOfDivisionHandle headOfDivisionHandle = new HeadOfDivisionHandle();
        AdminOfficerHandle adminOfficerHandle = new AdminOfficerHandle();
        SaleOfficerHandle saleOfficerHandle =new SaleOfficerHandle();
        EmployeeListDisplay employeeListDisplay =new EmployeeListDisplay();
        Dictionary<String, Integer> choice=employeeListDisplay.menuSelectEmployees(scanner);
        for (int i = 0; i < choice.get("number of employee"); i++) {
            if(choice.get("type of employee")==1){
                saleOfficerHandle.addSaleOfficer(scanner,employees);
            }else if(choice.get("type of employee")==2) adminOfficerHandle.addAdminOfficer(scanner,employees);
            else headOfDivisionHandle.addHeadOfDivision(scanner,employees);
        }
        employeeListDisplay.displayEmployeeList(employees);
        System.out.println("nhap Id muon tim kiem de thay doi thong tin");
        employeeHandle.modifyEmployeeById(scanner,employees);
        System.out.println("nhap Id nhan vien muon xoa");
        employeeHandle.removeEmployeeById(scanner,employees);
        System.out.println("cac nhan vien tim thay theo luong la");
        employeeListDisplay.displayEmployeeList(employeeHandle.findEmployeeBySalary(scanner,employees));
    }
}
