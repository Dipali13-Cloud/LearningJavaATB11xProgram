package Tasks;

public class Task031_Hierarchical_Inheritance {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.login();
        sa.interest();

        System.out.println("------------------------------");

        CurrentAccount ca = new CurrentAccount();
        ca.login();
        ca.overdraft();
    }
}
class Account{
    void login(){
        System.out.println("Logging into account...");
    }
}
class SavingAccount extends Account{
    void interest(){
        System.out.println("Savings Account interest...");
    }
}
class CurrentAccount extends Account{
    void overdraft(){
        System.out.println("Overdraft feature available...");
    }
}