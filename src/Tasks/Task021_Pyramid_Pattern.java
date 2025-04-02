package Tasks;

import java.util.Scanner;

public class Task021_Pyramid_Pattern {
    public static void main(String[] args) {
        //int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int k=0;k<=n-i-1;k++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
