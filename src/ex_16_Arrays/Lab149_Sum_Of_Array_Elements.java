package ex_16_Arrays;

public class Lab149_Sum_Of_Array_Elements {
    public static void main(String[] args) {
        int[] marks = {76,98,91};
        int sum = 0;
//        for (int i = 0 ; i<marks.length; i++)
//        {
//            sum = sum+marks[i];
//        }
//        System.out.println("Sum of array elements: "+sum);

        System.out.println("For each loop");
        for (int addtion:marks)
        {
            sum=sum+addtion;
        }
        System.out.println(sum);
    }
}
