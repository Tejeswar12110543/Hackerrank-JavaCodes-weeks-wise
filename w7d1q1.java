import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String paragraph = str.nextLine().toLowerCase();
        String word = str.next().toLowerCase();
        int n = str.nextInt();

        if (n <= 0) {
            System.out.println("Incorrect Input");
            return;
        }
        int count = 0;
        int index = -1;
        int lastOccurrenceIndex = -1;

        while (true) {
            index = paragraph.indexOf(word, index + 1);
            if (index == -1) {
                break; 
            }
            count++;
            if (count == n) {
                System.out.println(index);
                return;
            }
            lastOccurrenceIndex = index;
        }
        if (count == 0) {
            System.out.println("Not Present");
            return;
        }
        System.out.println(lastOccurrenceIndex);
    }
}
