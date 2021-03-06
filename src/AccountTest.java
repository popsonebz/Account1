import java.util.Scanner;

/**
 * Created by popoola on 2016/03/03.
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create two Account objects
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.33);

        /*System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
*/
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        /*System.out.printf("%s balance: $ %.2f %n",
                account1.getName(), account1.getBalance() );
        System.out.printf("%s balance: $ %.2f %n%n",
                account2.getName(), account2.getBalance() );
*/
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        /**System.out.printf("%s balance: $ %.2f %n",
                account1.getName(), account1.getBalance() );
        System.out.printf("%s balance: $ %.2f %n%n",
                account2.getName(), account2.getBalance() );
**/
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdrawal amount for account1: "); // prompt
        double withDrawalAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n",
                withDrawalAmount);
        account1.withDrawal(withDrawalAmount); // subtract to account1 balance
        displayAccount(account1);

    }
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $ %.2f %n",
                accountToDisplay.getName(), accountToDisplay.getBalance() );
    }
}
