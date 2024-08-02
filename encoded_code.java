package Arrays;
import java.util.*;
public class encoded_code {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a size ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter a array element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int ans[]=new int[n];
        int value=0;
        for(int i=n-1;i>=0;i--)
        {
            value=arr[i]-value;
            ans[i]=value;

        }
            System.out.println("answer is : ");
        for(int x : ans)
        {
            System.out.println(x +" ");
        }
        in.close();
    }
}
