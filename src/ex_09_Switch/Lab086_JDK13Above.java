package ex_09_Switch;

public class Lab086_JDK13Above {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode)
        {
            case 001 -> System.out.println("A");
            case 002 -> System.out.println("B");
            case 003 -> System.out.println("C");
            default -> System.out.println("Invalid");
        }
    }
}
