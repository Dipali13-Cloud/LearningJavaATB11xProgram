package ex_18_OOPs_Constructor;

public class Lab167_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2;
        new Baby();
    }

}
class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Behaviour
    void sleep()
    {
        System.out.println("Sleep");
    }
    void cry()
    {
        System.out.println("Cry");
    }
    void eat()
    {
        System.out.println("Eat");
    }

    // default constructor
    Baby()
    {
        System.out.println("I am called, Default Constructor!");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }

}
