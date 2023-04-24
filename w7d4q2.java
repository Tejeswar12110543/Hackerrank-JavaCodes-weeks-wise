import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr = new Scanner(System.in);
        
        String str = scr.nextLine();
        
        str = str.toLowerCase();
        boolean numFound = false;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("Invalid input");
                numFound = true;
                break;
            }
        }
        
        if(!numFound){
        
        Stack<Character> st = new Stack<>();
        int i=0;
        String ans = "";
        
        
        while(i<str.length()){
            char ch = str.charAt(i);
            
            if(ch == ' '){
                while(st.isEmpty() == false){
                    ans += st.pop();
                   // System.out.println(ans);
                }
                ans += ' ';
            }
            else{
                st.push(ch);
            }
        
           
            i++;
            
            //System.out.println(st);
        }
        while(st.isEmpty() == false){
                    ans += st.pop();
                   // System.out.println(ans);
                }
            System.out.println(ans);
        }
       
            
    }
}
