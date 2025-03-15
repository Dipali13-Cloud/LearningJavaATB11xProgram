package Tasks;

public class Task005_Inc_Dec_Operator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        // A+B+C
        // A-> --a -> 19
        // B-> a++ -> 20
        // C-> a-- -> 19
        System.out.println(a);
    }
}
