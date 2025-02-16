import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        // Number of student is less than or equal to zero.
        if (n <= 0) {
            System.out.println("Invalid number of students. Exiting program.");
            sc.close();
            return;
        }

        int[] grades = new int[n];
        int sum = 0;
        int highest = Integer.MIN_VALUE;  // - infinity
        int lowest = Integer.MAX_VALUE;   // + infinity
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade of student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            
            sum += grades[i];
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        
        double average = (double) sum / n; 
        // output
        System.out.println("\nResults:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        sc.close();
    }
}
