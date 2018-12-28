import java.io.*;
import java.util.*;
public class SemiPrime 
{
 public static void main(String[]args) throws IOException
 {
 System.out.println(isSemiPrime(95));
 }

   public static boolean isPrime(int n){
   if(n==1)
   return false;
   for(int i=2;i<n-1;i++)
   { 
   if(n%i==0)
   return false;
   }
   return true;
   }

   public static boolean isSemiPrime(int n){
   for(int i=1;i<=n;i++){ //loop through all numbers from 1 to n
   if(isPrime(i)==true){  // check if each number(i) is prime 
   for(int j=1;j<=n;j++){ // loop through all numbers form 1 to n to find the second figure
   if(isPrime(j)==true){ // check if its prime
   if(i*j==n)            // if both i x j =n stop there and retun true
   return true;
   }
  
   }
   }
   }
   return false;
   }

}