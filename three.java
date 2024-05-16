import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("size : ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("elements \n");
        for(int i=0;i<n;arr[i++]=in.nextInt());
        for(int i :arr)
        {
            System.out.println(i);
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The big value is "+max);
    }
}
