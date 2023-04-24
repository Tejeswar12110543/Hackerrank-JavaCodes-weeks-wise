import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class employee {
    int id;
    int age;

    employee(int i, int a) {
        id = i;
        age = a;
    }

    void display() {
        System.out.println(id + " " + age);

    }

}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        if(n>=1 && n<=10){
            
        
        employee e[] = new employee[n];
        int minind = 0;
        for (int i = 0; i < n; i++) {
            int id = str.nextInt();
            int a = str.nextInt();
            if((id>=10 && id<=1000) && (a>=18 && a<=50)){
                e[i] = new employee(id, a);
                if (a < 30) {
                    minind = i;
                }
            }
            else{
                System.out.print("Invalid data");
            }
            
        }

        e[minind].display();
        }
        else{
            System.out.print("Invalid input");
        }
    }
} 
