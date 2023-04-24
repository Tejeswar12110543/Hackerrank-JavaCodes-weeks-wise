import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double borrowedAmount = sc.nextDouble();
        double interest = borrowedAmount * 0.1;
        double totalAmount = borrowedAmount + interest;
        double emi = totalAmount / 12;
        System.out.println((int) totalAmount + "\n" + String.format("%.2f", emi));
    }
}
