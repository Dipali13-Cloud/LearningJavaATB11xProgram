package ex_16_Arrays;

import java.util.Arrays;

public class Lab150_Int_Que_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34

        Arrays.sort(numbers);
        System.out.println("First highest no is: "+numbers[numbers.length-1]);
        System.out.println("Second highest no is: "+numbers[numbers.length-2]);
        System.out.println("Third highest no is: "+numbers[numbers.length-3]);
    }
}
