package ex_05_TypeCasting;

public class Lab056_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
       // int total = course+GST;              // Narrow - Implicit
        int total1 = course+(int)GST;          // // Narrow - Explicit
        System.out.println(total1);

        float total2 = course + GST;
        float total3 = (float) course + GST;
        System.out.println(total2);             // Widening - auto - implicit
        System.out.println(total3);             // Widening  - Explicit
    }
}
