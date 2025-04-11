package Tasks;

import java.util.Scanner;

public class Task037_SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int no1 = sc.nextInt();
        System.out.println("Enter second no");
        int no2 = sc.nextInt();
        System.out.println("Enter third no");
        int no3 = sc.nextInt();
        int smallest_No;

        if(no1<no2 && no1<no3){
            smallest_No = no1;
        }else if (no2<no3){
            smallest_No = no2;
        }else {
            smallest_No = no3;
        }

        System.out.println("Smallest no among three numbers: "+smallest_No);
    }
}
