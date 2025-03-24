package Tasks;

import java.util.Scanner;

public class Task013_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            revString = revString+str.charAt(i);
        }
        System.out.println("reversed String is: "+revString);
    }
}
