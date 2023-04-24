import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

       
        String str1 = scr.nextLine().toLowerCase();
      
        String str2 = scr.nextLine().toLowerCase();
        if (str1.length() <= 2 || str2.length() <= 2) {
            System.out.println("Invalid Input");
            return;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        if (Arrays.equals(charArr1, charArr2)) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }
    }
}
