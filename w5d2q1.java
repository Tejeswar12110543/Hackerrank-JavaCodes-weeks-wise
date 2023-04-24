import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



class Complex {
    private int real;
    private int imaginary;
    
    
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    
    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
   
    public Complex Mul_Complex(Complex num1, Complex num2) {
        int realPart = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
        int imaginaryPart = (num1.real * num2.imaginary) + (num2.real * num1.imaginary);
        Complex result = new Complex(realPart, imaginaryPart);
        return result;
    }
    
   
    public void Display() {
        if (real<1 && imaginary < 1) {
            System.out.println(real + "" + imaginary + "i");
        } else {
            System.out.println(real + "+" + imaginary + "i");
        }
    }
}

public class Test_Complex {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
       
        int real1 = str.nextInt();
        
        int imaginary1 = str.nextInt();
        Complex num1 = new Complex(real1, imaginary1);
        
        
        int real2 = str.nextInt();
      
        int imaginary2 = str.nextInt();
        Complex num2 = new Complex(real2, imaginary2);
        
        Complex result = num1.Mul_Complex(num1, num2);
      
        result.Display();
    }
}
