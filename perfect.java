package coding_java;
import java.util.Scanner;

public class perfect {

public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
System.out.println("number solra ");
int num=in.nextInt();
int sum=0;
for(int i=1;i<=num/2;i++){
    if(num%i==0)
    {
        sum=sum+i;
    }
}
boolean res;
res=(sum==num)? true:false;
System.out.println(res);
in.close();

}
}

