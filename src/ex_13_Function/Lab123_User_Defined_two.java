package ex_13_Function;

public class Lab123_User_Defined_two {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // 1.Without Argument / Parameters and Without Return Type.
        woutpara_woutreturn_greet();

        //  2. Without Parameters but With Return Type
        String msg = woutpara_withreturn_greet();
        System.out.println(msg);

        //  3. With Parameters and Without Return Type ( 90%)
        greet_with_details("Dipa",31,100000);
        greet_with_details("Divya",30,50000);
        greet_with_full_name("Dipali","Kunwar");

        //  4. With Parameters and With Return Type
        int sum = sum_of_three_nos(5,6,7);
        int sum1 = sum_of_three_nos(56,78,89);
        int sum2 = sum_of_three_nos(1000,3908,6890);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void woutpara_woutreturn_greet() {
        System.out.println("Hello");
    }
    //  2. Without Parameters but With Return Type
    static String woutpara_withreturn_greet() {
        System.out.println("Hi");
        return "How are you?";
    }
    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name,int age, double salary)
    {
        System.out.println("Name: " +name+ "\nAge: " +age+ "\nSalary: " +salary);
    }
    static void greet_with_full_name(String fname,String lname)
    {
        System.out.println("First Name: "+fname+"\nLast Name: "+lname);
    }
    //  4. With Parameters and With Return Type
    static int sum_of_three_nos(int a,int b,int c)
    {
        return a+b+c;
    }

}

