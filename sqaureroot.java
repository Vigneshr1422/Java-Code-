import java.util.*;

public class sqaureroot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Number");
        int n=in.nextInt();
        int x;
        int sqrtnum=n/2;
        do{
            x=sqrtnum;
            sqrtnum=(x+(n/sqrtnum))/2;

        }while((x-sqrtnum)!=0);
        System.out.println("result  is "+sqrtnum);
    }
}
