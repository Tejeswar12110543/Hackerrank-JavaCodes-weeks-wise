import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int fact(int n){
    if(n==1)
        return 1;
    return fact(n-1)*n;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        if(x==1){
            if(n%2==0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        if(x==2){
            if(x%2!=0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        if(x==3){
            int count=0;
            for(int i=2;i<n;i++){
                if(i%n==0)
                    count++;
            }
            if(count!=0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        if(x==4){
            System.out.println(fact(n));
        }
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
