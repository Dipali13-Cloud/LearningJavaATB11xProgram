package ex_16_Arrays;

import java.util.Scanner;

public class Lab147_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array(int only)");
        int size = sc.nextInt();

        String[] num = new String[size];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the number");
            num[i] = sc.next();
        }
        System.out.println("");
        System.out.println("Here are the array elemnts:");
//        for (int i=0;i<num.length;i++)
//        {
//            System.out.println(num[i]);
//        }

        for (String n:num)                                   // for each(enhanced array)
        {
            System.out.println(n);
        }
        sc.close();

    }
}
