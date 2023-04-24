import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        if (n < 2) {
            System.out.println("Invalid");
            return;
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.next();
        }

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
