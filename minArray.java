import java.io.*;
import java.util.*;
public class minArray{
public static void main(String[]args) throws IOException{

int a[]={4,6,2,3,1,8,0};
System.out.println(minArray(a));
System.out.println(secondLowest(a));
}
public static int minArray(int[]a){ // O(n) runtime complexity
int min=a[0];
for(int i=0; i<a.length;i++){
if (a[i]<min)
min=a[i];
}
return min;
}

public static int secondLowest(int[]a){
int min=a[0];
int sec=0;
int temp;
for(int i=0; i< a.length;i++){   //O(n) runtime complexity. This is faster than arrays.sort and outputting the 2nd element as that will be O(n^2) runtime
if(a[i]<min){
temp=min;
min=a[i];
sec=temp;
}
}

return sec;
}

}
