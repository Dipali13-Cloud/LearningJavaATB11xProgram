package ex_07_Increment_Decrement_Operator;

public class Lab065_Pre_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;              // 10+1 -> b -> 11
        System.out.println(b);    // 11
        System.out.println(a);    // 11

        //  Expression and Result Table
        // Line No | a      |  Result b
        //       5 | 10     |  NA
        //       6 | 11     |  11
        //       7 | 11(NA) |  11
        //       8 | 11     |  11(NA)
    }
}
