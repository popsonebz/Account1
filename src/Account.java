/**
 * Created by popoola on 2016/03/03.
 */
public class Account {
    private String name;

    public Account(String name) // constructor name is class name
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
