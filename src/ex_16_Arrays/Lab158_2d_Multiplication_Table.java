package ex_16_Arrays;

import java.util.Scanner;

public class Lab158_2d_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size_of_table = sc.nextInt();

        for (int i = 1; i <= size_of_table; i++) {
            for (int j = 1; j <= size_of_table; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
