/**
 * Created by popoola on 2016/03/03.
 */
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) // constructor name is class name
    {
        this.name = name;
        if (balance>0.0){
            this.balance = balance;
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void deposit(double depositAmount){
        if (depositAmount>0.0){
            balance = balance + depositAmount;
        }
    }
    public void withDrawal(double withDrawalAmount){
        if(withDrawalAmount<=balance){
            balance = balance - withDrawalAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

}
