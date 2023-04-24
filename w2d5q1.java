import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
Scanner input = new Scanner(System.in);

double c1 = input.nextDouble();
double c2 = input.nextDouble();
double c3 = input.nextDouble();

int fullC1 = (int) Math.ceil(c1);
int fullC2 = (int) Math.ceil(c2);
int fullC3 = (int) Math.ceil(c3);

System.out.println( fullC1 + " " + fullC2 + " " + fullC3);


}
}
