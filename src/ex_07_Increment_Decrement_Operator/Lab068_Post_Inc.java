package ex_07_Increment_Decrement_Operator;

public class Lab068_Post_Inc {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        //  Line No |  a  | Exp
        //       5  |  10 | NA
        //       6  |  11 | 10
        //       7  |  11 | NA
        //       8  |  NA | NA
    }
}
