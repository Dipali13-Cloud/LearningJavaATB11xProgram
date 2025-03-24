package ex_13_Function;

import java.util.Scanner;

public class Lab125_Arithmatic_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = 0;
        if(sc.hasNextInt()) {
             a = sc.nextInt();
        }
        else {
            System.out.println("Enter the int value only.");
            System.exit(0);
        }
        System.out.println("Enter the second number");
        int b = 0;
        if(sc.hasNextInt())
        {
            b = sc.nextInt();
        }
        else {
            System.out.println("Enter the int value only");
            System.exit(0);
        }

        int addition = sum(a,b);
        int subtraction = sub(a,b);
        int division = div(a,b);
        int multiplication = mul(a,b);
        int mod = mod(a,b);

        System.out.println("Addition: "+addition);
        System.out.println("Subtraction: "+subtraction);
        System.out.println("division: "+division);
        System.out.println("Multiplication: "+multiplication);
        System.out.println("Mod: "+mod);

    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Division by zero is not allowed.");
        }
        return a / b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
}
