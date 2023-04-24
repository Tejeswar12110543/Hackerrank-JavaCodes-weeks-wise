import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%100!=0){
            System.out.println("Invalid Input");
        }
        else{
            if(x%2000==0)
                System.out.println("1 2000 Notes");
            else {
                 int y=x-500*(x/500);
                System.out.println(y/100+" 100 Notes");
                System.out.println(x/500+" 500 Notes");
               
        }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
