import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=10){
            int sum=0;
            int mark;
            for(int i=0;i<n;i++){
                mark=sc.nextInt();
                if(mark<100&&mark>=0)
                    sum=sum+mark;
            }
            System.out.print(sum);
        }
        else{
            System.out.print("Invalid");
        }
    }
}
