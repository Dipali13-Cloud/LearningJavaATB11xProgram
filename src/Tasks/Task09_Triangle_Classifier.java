package Tasks;

import java.util.Scanner;

public class Task09_Triangle_Classifier {
    public static void main(String[] args) {

        // Triangle Classifier:

        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // Determine if the triangle is Equilateral (all sides are equal),
        // Isosceles (exactly two sides are equal),
        // or Scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first size: ");
        int s1 = scanner.nextInt();
        System.out.println("Enter the second size: ");
        int s2 = scanner.nextInt();
        System.out.println("Enter the third size: ");
        int s3 = scanner.nextInt();

        if(s1==s2 && s2==s3)
            System.out.println("Triangle is Equilateral.");
        else if(s1==s2 || s1==s3 || s2==s3)
            System.out.println("Triangle is Isosceles.");
        else
            System.out.println("Triangle is Scalene.");
    }
}
