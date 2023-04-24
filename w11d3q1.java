import java.util.Scanner;

public class WordFormation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String word1 = scr.nextLine();
        String word2 = scr.nextLine();
        scr.close();
        
        if (word1.length() < 3 || word2.length() < 3) {
            System.out.println("ERROR");
        } else {
            String start1 = word1.substring(0, 3);
            String end2 = new StringBuilder(word2.substring(word2.length()-3)).reverse().toString();
            
            if (start1.equals(end2)) {
                System.out.println("GREAT");
            } else {
                System.out.println("TRY NEXT TIME");
            }
        }
    }
}
