package Tasks;

import java.util.Scanner;

public class Task014_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();

        int revNo=0;
        while (no!=0)
        {
            revNo = revNo*10 + no%10;
            no = no/10;
        }
        System.out.println("Reversed Number is: "+revNo);
    }
}
