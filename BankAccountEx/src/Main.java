import entity.Account;
import handle.AccountHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHandle accountHandle  =new AccountHandle();
        Account account = accountHandle.createAccount(scanner);
        account.changeEmail("hattoryha@yahoo.com");
        account.recharge(3000);
        account.displayInfo();

    }
}
