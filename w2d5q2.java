import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner kl=new Scanner(System.in);
    double a=kl.nextDouble();
    if(a<=0)
    {
        System.out.println("Invalid Input");
    }
    else
    {
        System.out.println((int) Math.ceil(a));

    }
    }
}
