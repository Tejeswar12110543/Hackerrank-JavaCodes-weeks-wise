import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int percentage = (b * 100) / a;
    System.out.println(percentage );
    
    if (percentage >= 75) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  
    }
}
