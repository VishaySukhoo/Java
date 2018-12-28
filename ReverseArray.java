import java.io.*;
import java.util.*;

public class ReverseArray {

public static void main(String[]args) throws IOException{
int temp;
int arr[]={1,2,3,4,5};
int count=0;
int dec=arr.length-1;
int middle=arr.length /2; 
while(count < middle)
{
temp=arr[count];
arr[count]=arr[dec];
arr[dec]=temp;//swap elements
count++;
dec--;
}
for(int i=0;i< arr.length;i++)
{
System.out.print(arr[i]);
}
}
}





