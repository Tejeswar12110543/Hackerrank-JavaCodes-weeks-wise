// week1 day2
import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner obj=new Scanner(System.in);
        int num,i,count=0;
        num=obj.nextInt(); 
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
            break; 
            }
        }
            if(count==0)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }
    }
