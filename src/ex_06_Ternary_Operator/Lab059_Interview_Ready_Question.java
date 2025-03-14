package ex_06_Ternary_Operator;

public class Lab059_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int no = 25;
        String result = (no>10)? (no>20 ? "No is greater than 20" : "No is less than 20") : "B";
        System.out.println(result);


    }
}
