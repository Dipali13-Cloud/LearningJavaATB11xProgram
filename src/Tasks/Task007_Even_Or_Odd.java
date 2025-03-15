package Tasks;

import java.util.Scanner;

public class Task007_Even_Or_Odd {
    public static void main(String[] args) {

        //Create a Program -
        // Take user input &
        // Check weather the input is even or odd number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = scanner.nextInt();

        if(no%2==0)
            System.out.println("No is Even");
        else
            System.out.println("No is Odd");
    }
}
