import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passed = 0;
        int failed = 0;

        for (int mark : marks) {
            total += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
            if (mark >= 40) passed++;
            else failed++;
        }

        double average = (double) total / n;

        System.out.println("\nAll Marks:");
        for (int mark : marks) System.out.println(mark);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Passed = " + passed);
        System.out.println("Failed = " + failed);
    }
}

