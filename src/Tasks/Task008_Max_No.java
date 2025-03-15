package Tasks;

public class Task008_Max_No {
    public static void main(String[] args) {

        // Take a user input 2 numbers from the arguments
        // and calculate the maximum in between with ternary operator.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("First no: "+a);
        System.out.println("Second no: "+b);
        int max_No =  a>b ? a : b;
        System.out.println("Maximum no is: "+max_No);

    }
}
