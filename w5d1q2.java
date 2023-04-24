import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
       
        arr[j++] = arr[n-1];
       
        return j;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        if (n >= 5 && n <= 15) {

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = str.nextInt();
            }
            int choice = str.nextInt();
            if (choice == 1) {
                Arrays.sort(arr);
                n=removeDuplicates(arr, n);
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                
            } else if (choice == 2) {
                Arrays.sort(arr);
                n=removeDuplicates(arr,n);
                for (int i = n - 1; i > 0; i--) {
                    System.out.print(arr[i] + " ");
                }

            } else {
                System.out.print("Invalid Input");
            }
        } else {
            System.out.print("Invalid");
        }
    }
}
