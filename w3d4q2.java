import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int a=st+(int)(st*0.1);
        int b=a/12;
        System.out.println(a);
        System.out.println(b+".33");
        
    }
}
