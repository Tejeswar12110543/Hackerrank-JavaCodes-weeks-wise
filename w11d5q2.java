import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr = new Scanner(System.in);
        boolean isBigger = false;
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        if(num1>num2){
            isBigger=true;
        }
        else{
            isBigger=false;
        }
        System.out.print(isBigger);
    }
}
