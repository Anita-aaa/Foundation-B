// 1
// import java.util.Arrays;
/*1.The university wants to calculate the average grades of students in a particular course.
 Write a Java program that takes an array of grades as input and returns the average grade.
i.Write a function named calculate Average that takes an array of integers as a parameter 
and returns the average of the values.
ii.Display the calculated average grade on the console. */
public class AverageGrades {
    // Function to calculate the average of grades in an array
    public static double calculateAverage(int[] grades) {
        if (grades == null || grades.length == 0) {
            // Handle the case when the array is empty or null
            return 0.0;
        }

        // Calculate the sum of all grades in the array
        int sum = 0;             /*// Calculate the sum of all grades in the array
                                int sum = 0;
                                for (int grade : grades) {
                                    sum += grade;
                                } */
        for (int i=0;i<grades.length;i++) {
            sum += grades[i];
        }

        // Calculate the average by dividing the sum by the number of grades
        double average = (double) sum / grades.length;
        return average;
    }

    public static void main(String[] args) {
        // Sample grades array
        int[] grades = { 85, 90, 78, 92, 88 };

        // Call the calculateAverage function to get the average grade
        double averageGrade = calculateAverage(grades);

        // Display the calculated average grade on the console
        System.out.println("Average Grade: " + averageGrade);
    }
}
// output
// Average Grade: 86.6