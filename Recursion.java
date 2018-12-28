import java.io.*;
import java.util.*;

public class Recursion {

public static void main(String[]args) throws IOException
{
System.out.println(mult(4,3));
System.out.println(factorial(4));
}
public static int mult(int a , int b) // multiplies 2 numbers by addition only
{
 if(b==1)
 return a;
 return a + mult(a, b - 1);
}

/* b=3 4 + mult(4,2)  =12
   b=2 4 + mult(4,1)  =8
   b=1 4              =4
   
   */
   
   public static int factorial(int n){ // if n=4 then 4x3x2x1=24
   if(n==1){
   return 1;
   }
      System.out.println(n);

   return n *factorial(n-1);
 
   }
   /* frame 1 n=4 output:4 4xfact(3)=24
      frame 2 n=3 output:3 3xfact(2)=6
      frame 3 n=2 output:2 2xfact(1)=2
      frame 4 n=1 output:  1        =1
      */
      
      }