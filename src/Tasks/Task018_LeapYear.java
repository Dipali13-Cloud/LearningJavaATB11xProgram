package Tasks;

import java.util.Scanner;

public class Task018_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to be checked: ");
        int year = sc.nextInt();

        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
                leap = true;
            }
            leap = true;
        }
        System.out.println(year+" is a leap year? -> "+leap);
    }
}
