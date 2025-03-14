package Tasks;

import java.util.Scanner;

public class Task003_Grade_Calculator {
    public static void main(String[] args) {
         /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();

        String grade = (score>=90 && score <=100) ? "A" :
                        (score>=80 && score<=89) ? "B" :
                                (score>=70 && score<=79) ? "C" :
                                        (score>=60 && score<=69) ? "D":
                                                (score>=0 && score<=59) ? "F" : "Invalid";
        System.out.println("Your Grade is : "+grade);


    }
}
