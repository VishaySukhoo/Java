import java.io.*;
public class basicMath {

public static void main(String[]args) throws IOException
{
System.out.println(sumFastest(300000));
System.out.println(sumNextFastest(300000));
}

public static int sumFastest(int n){
return n *(n + 1) /2;
}
public static int sumNextFastest(int n){
int sum=0;
for (int i=1; i<=n; i++){
sum=sum+i;
}
return sum;
}

}
