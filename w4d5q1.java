import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        // Read the number of subjects
        
        int numSubjects = str.nextInt();

        // Read the CA marks for each subject
        double[][] marks = new double[numSubjects][];
        for (int i = 0; i < numSubjects; i++) {
            
            int numCAs = str.nextInt();

            marks[i] = new double[numCAs];
            for (int j = 0; j < numCAs; j++) {
                
                marks[i][j] = str.nextDouble();
            }
        }

        // Read the subject number for which average marks should be displayed
        
        int subjectNum = str.nextInt();

        // Calculate and display the average marks for the selected subject
        double sum = 0;
        for (double mark : marks[subjectNum - 1]) {
            sum += mark;
        }
        double avg = sum / marks[subjectNum - 1].length;

        System.out.println("Average in Subject-" + subjectNum + " is " + avg);
    }
}
