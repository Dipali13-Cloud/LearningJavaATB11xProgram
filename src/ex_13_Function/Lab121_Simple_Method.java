package ex_13_Function;

public class Lab121_Simple_Method {
    public static void main(String[] args) {

        // call
        // void methods do not return anything, so you cannot assign them to a variable.
        // Only methods with specific return types (e.g., int, String, boolean)
        // can return a value that can be stored.

        // int result = no_return();
        // System.out.println(result);

        int res = return_int();
        System.out.println(res);

        String res1 = return_string();
        System.out.println(res1);

    }
    static void no_return()
    {
        System.out.println("Void function returns nothing.");
    }
    static int return_int()
    {
        return 10;
    }
    static float return_float()
    {
        return 3.14f;
    }
    static boolean return_boolean()
    {
        return true;
    }
    static byte return_byte()
    {
        return 100;
    }
    static long return_long()
    {
        return 1000l;
    }
    static String return_string()
    {
        return "Dipali";
    }
}
