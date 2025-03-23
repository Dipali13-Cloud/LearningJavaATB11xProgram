package ex_12_DoWhile_Loop;

public class Lab115_DoWhile {
    public static void main(String[] args) {
        int a=1;
        do {
            System.out.println("This is body, and it will execute at least one time in do while loop");
            System.out.println(a);
            a++;
        }while (a<10);
    }
}
