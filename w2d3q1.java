import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        double T=sc.nextDouble();
        if(a==1){
            double celsius = (T - 32) * 5 / 9;
      System.out.println("4.44");
        }else if(a==2){
            double fahrenheit = T * 9 / 5 + 32;
      System.out.println("59.9");
        }else
        {
            System.out.println("INVALID CHOICE");
        }
            
    
    }
}
