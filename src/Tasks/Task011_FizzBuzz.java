package Tasks;

public class Task011_FizzBuzz {
    public static void main(String[] args) {
        int no = 100;
        for (int i = 1; i <= no; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }
}

