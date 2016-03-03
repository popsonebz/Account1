import java.util.Scanner;

/**
 * Created by popoola on 2016/03/03.
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create two Account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
}
