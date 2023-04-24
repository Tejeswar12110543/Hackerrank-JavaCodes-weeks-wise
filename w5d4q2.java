import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();  
        scr.nextLine();  
        String[] arr = scr.nextLine().split(" ");  
        int numCount = 0;  
        int strCount = 0;  

        for (String elem : arr) {
            if (isInteger(elem)) {  
                numCount++;
            } else {
                strCount++;
            }
        }

        System.out.println(numCount);  
        System.out.println(strCount);  
    }

    
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    
