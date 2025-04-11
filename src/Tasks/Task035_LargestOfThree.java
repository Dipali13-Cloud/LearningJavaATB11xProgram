package Tasks;

import java.util.Scanner;

public class Task035_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int no1 = sc.nextInt();
        System.out.println("Enter second no");
        int no2 = sc.nextInt();
        System.out.println("Enter third no");
        int no3 = sc.nextInt();
        int largest;

        if (no1>no2 && no1>no3){
            largest = no1;
        }else if(no2 > no3){
            largest = no2;
        }else {
            largest = no3;
        }
        System.out.println("Largest no among three numbers: "+largest);
    }
}
