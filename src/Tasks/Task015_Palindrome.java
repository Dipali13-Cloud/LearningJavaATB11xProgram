package Tasks;

import java.util.Scanner;

public class Task015_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String org_String = str;
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        if (org_String.equals(revString)) {
            System.out.println(org_String + " is palindrome string.");
        } else {
            System.out.println(org_String + " is not palindrome string.");
        }
    }
}
