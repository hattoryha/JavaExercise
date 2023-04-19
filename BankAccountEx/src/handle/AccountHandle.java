package handle;

import entity.Account;

import java.util.Scanner;

public class AccountHandle {
    public Account createAccount(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter accountNumber");
        long accountNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Enter accountBalance");
        long accountBalance = Long.parseLong(scanner.nextLine());
        return new Account(name, email, accountNumber, accountBalance);
    }
}
