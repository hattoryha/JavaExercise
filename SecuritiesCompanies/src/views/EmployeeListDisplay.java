package views;

import entity.Employee;

import java.util.*;

public class EmployeeListDisplay {
    public Dictionary<String, Integer> menuSelectEmployees(Scanner scanner){
        System.out.println("choose the type of employee: ");
        System.out.println("""
                1:SaleOfficer,
                2:AdminOfficer,
                3,HeadOfDivision
                """);
        int option = Integer.parseInt(scanner.nextLine());
        System.out.println("choose the number of employee: ");
        int numberOfEmployee = Integer.parseInt(scanner.nextLine());
        Dictionary<String, Integer> choice = new Hashtable<>();
        choice.put("type of employee", option);
        choice.put("number of employee", numberOfEmployee);
        return choice;
    }
    public void displayEmployeeList(ArrayList<Employee> employees){
        for (Employee e:employees
             ) {
            System.out.println(e);
        }

    }



}
