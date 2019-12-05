import java.io.*;
import java.util.*;

public class Fizzbuzz {

public static void main(String[]args) throws IOException {
System.out.println("Fizzbuzz challenge");
System.out.println("==================");
int i;  
for( i=1; i<=100; i++){
if(i%15==0){
System.out.println("Fizzbuzz");
}
else if(i%5==0){
System.out.println("Buzz");
}
else if( i%3==0){
System.out.println("Fizz");
}
else{
System.out.println(i);
}
}

}

}