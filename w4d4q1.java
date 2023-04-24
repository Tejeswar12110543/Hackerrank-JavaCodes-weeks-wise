import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner str=new Scanner(System.in);
        int n=str.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
        arr[i]=str.nextInt();
        }
        int x=0;
       for(int i=0;i<n;i++){ 
           x+=arr[i];
       }
        System.out.println(x);
    }
}
