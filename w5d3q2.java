import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr=new Scanner(System.in);
        int eid=scr.nextInt();
        int salary;
        String S1=scr.nextLine();
        String S2=scr.nextLine();
        if(eid>201)
        {
          salary=21000;
            System.out.println(eid);
            System.out.println(S1);
            System.out.println(S2);
        }
        else{
            System.out.println("No Appraisal");
        }
    }
}
