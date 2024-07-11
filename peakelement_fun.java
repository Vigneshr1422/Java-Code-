package array;
import java.util.*;

public class peakelement_fun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Array size ");
        int x=in.nextInt();
        System.out.println("Enter Array elements ");
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
       System.out.println("The peaked element "+ peakelement_using_fun(arr));
    }
    public static int peakelement_using_fun(int arr[])
    {
        int n=arr.length;
        // array element only one
        if(n==1)
        {
            return arr[0];
        }
        // first element cheak
        if(arr[0]>=arr[1])
        {
            return arr[0];
        }
        // last element cheak
        if(arr[n-1]>=arr[n-2])
        {
            return arr[n-1];
        }
        // remaining element cheak
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;

    }
}
