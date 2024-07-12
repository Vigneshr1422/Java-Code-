package array;
import java.util.*;
public class k_th {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Size ");
        int n=in.nextInt();
        System.out.println("Enter a element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("target element is ");
        int target=in.nextInt();
        System.out.println("The answer is "+k_larges(arr, target));

    }

        public static int k_larges(int arr[],int target)
        {
        System.out.println("sorting happen");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        int result=arr[arr.length-target];
        return result;

    }
    
}
