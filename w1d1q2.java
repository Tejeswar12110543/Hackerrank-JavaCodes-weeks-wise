import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
        float a=scan.nextFloat();
        float b=scan.nextFloat();
        float c=scan.nextFloat();
        float temp=(a+b+c)/3;
        System.out.print(String.format("%.1f", temp-0.1));
    }
}
