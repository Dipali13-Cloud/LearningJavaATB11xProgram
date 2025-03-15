package Tasks;

public class Task004_Inc_Dec_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // A+B+C
        System.out.println(a);

        // A-> ++a -> 11, a=11
        // B-> a++ -> 11, a=12
        // C-> a++ -> 12, a=13
        // A+B+C -> 11+11+12 ->34

        // Line No  | a  | Expression
        //      5   | 10 | NA
        //      6   | 13 | 34
        //      7   | 13 | NA
    }
}
