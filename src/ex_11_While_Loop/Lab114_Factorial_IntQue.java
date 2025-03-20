package ex_11_While_Loop;

import java.util.Scanner;

public class Lab114_Factorial_IntQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no whose factorial you want: ");
        int no = scanner.nextInt();

        int factorial = 1;
        if (no<=0) {
            System.out.println(factorial);
        } else {
            for (int i=1;i<=no;i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of given no is: "+factorial);
        }

        scanner.close();
    }
}
