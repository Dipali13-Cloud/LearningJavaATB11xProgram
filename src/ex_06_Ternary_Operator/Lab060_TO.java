package ex_06_Ternary_Operator;

public class Lab060_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max_No = x>y? x:y;
        System.out.println("Maximum no is : "+max_No);
    }
}
