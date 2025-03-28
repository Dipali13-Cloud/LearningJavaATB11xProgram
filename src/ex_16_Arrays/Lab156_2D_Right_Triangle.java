package ex_16_Arrays;

import java.util.Scanner;

public class Lab156_2D_Right_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i=0;i<num;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
