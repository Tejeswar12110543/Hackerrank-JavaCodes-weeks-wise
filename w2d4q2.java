import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        
        String st=sc.nextLine();
        int len=st.length();
        if(st.charAt(len-2)==32||len==27)
            System.out.print("Invalid Input");
        else
        {
        int a=Integer.parseInt(st.substring(len-2));
      
        int n1=a/10,n2=a%10,s,p;
        s=n1+n2;
        p=n1*n2;
        int f=s+p;
        if(a==f)
        
            System.out.print("Special two digit number");
            else
                
        System.out.print("Not a special two digit number");
        }
    }
}
