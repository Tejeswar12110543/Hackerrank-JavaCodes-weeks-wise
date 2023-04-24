import java.util.Scanner;

public class StringIntegerCount {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        
        int n = scr.nextInt();
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scr.next();
        }

        
        int countStr = 0, countInt = 0;
        for (int i = 0; i < n; i++) {
            if (isInteger(arr[i])) {
                countInt++;
            } else {
                countStr++;
            }
        }

        
        System.out.println(countInt);
        System.out.println(countStr);
    }

    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
