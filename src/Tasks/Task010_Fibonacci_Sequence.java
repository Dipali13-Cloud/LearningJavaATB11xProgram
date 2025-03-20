package Tasks;

import java.util.Scanner;

public class Task010_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of sequence");
        int no = scanner.nextInt();

        int first=0, second=1, sum;
        System.out.print("Fibonacci Sequence: " +first+ " " +second+ " ");
        for (int i=2; i < no; i++)
        {
            sum = first+second;
            System.out.print(sum+ " ");
            first = second;
            second = sum;
        }
        scanner.close();
    }
}
