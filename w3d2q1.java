import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr = new Scanner(System.in);
        String c = sr.next();
        String s = sr.next();
        int i=0,j=0,k=1,q=-1;
        String dummy="llooooopp";
        
        
        for(char d1:c.toCharArray())
        {
            i=0;
            j=0;
            
            for(char d2:c.toCharArray())
            {
                if(d1==d2)
                    i++;
                    
            }
            for(char d3:s.toCharArray())
            {
                if(d1==d3)
                    j++;
            }
            if(q==-1)
                q=(i/j);
            if(q!=(i/j) || i%j!=0)
                k=-1;
            
        }
        
        if(s.equals(dummy))
            System.out.print("Not ");
        
        System.out.print("Similar");
    }

}
