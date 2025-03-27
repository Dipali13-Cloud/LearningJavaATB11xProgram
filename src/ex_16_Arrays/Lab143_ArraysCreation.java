package ex_16_Arrays;

public class Lab143_ArraysCreation {
    public static void main(String[] args) {
        int[] marks = {98,96,89,97,100,99,92};

        // 2nd way to create the array
        int[] marks2 = new int[5];      // fixed size
        int marks3[] = new int[5];      // fixed size

        String[] names = new String[3];
        names[0] = "Dipa";
        names[1] = "Riya";
        names[2] = "Shreya";

        System.out.println(names[0]);

    }
}
