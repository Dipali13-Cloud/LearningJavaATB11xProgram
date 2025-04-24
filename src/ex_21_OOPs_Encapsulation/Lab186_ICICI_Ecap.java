package ex_21_OOPs_Encapsulation;

public class Lab186_ICICI_Ecap {
    public static void main(String[] args) {

        ICICIBank b = new ICICIBank("Admin",1000);
       long bal = b.getBalance();
        System.out.println(bal);


        b.setBalance(100000);

        long after_up_bal = b.getBalance();
        System.out.println(b.getBalance());
    }

}
class ICICIBank{
//## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public ICICIBank(String name, long balance){
        this.name = name;
        this.balance = balance;
    }
    //    public String getNameOutside() {
//        return name;
//    }
//
//    public void setNameOutside(String name) {
//        this.name = name;
//    }
//
//    public long getBalanceOutSide() {
//        return bal;
//    }
//
//    public void setBalanceIfCashier(long bal,boolean isCashier) {
//        if (isCashier) {
//            this.bal = bal;
//        } else {
//            System.out.println("Not allowed to change the Bal");
//        }
//    }
}