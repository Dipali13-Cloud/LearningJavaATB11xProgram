package Tasks;

import java.util.Scanner;

public class Task036_SmallestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int no1 = sc.nextInt();
        System.out.println("Enter second no");
        int no2 = sc.nextInt();

       int small_no = (no1 < no2) ? no1 : no2;
        System.out.println("Smallest no is: "+small_no);

    }
}
