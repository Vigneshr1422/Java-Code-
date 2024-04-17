package arrays;
import java.util.*;
public class firstlastOccurence {
    public static int[] answer(int[] arr,int target)
    {
        int []result = {-1,-1};
        int low =0;
        int high=arr.length-1;
        int mid = 0;

        while(low <= high)
        {
            mid=(low+high)/2;
            if(target==arr[mid])
            {
                result[0]=mid;
                high = mid -1;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        low=0;
        high=arr.length-1;
        mid=0;

        while(low <= high)
        {
            mid=(low+high)/2;
            if(target==arr[mid])
            {
                result[1]=mid;
                low = mid+1;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high=mid-1;
            }
           
        }
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Target element not found.");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The elements are ");
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]+" ");
        }
        System.out.print("Enter the target element : ");
        int target =in.nextInt();
        
        System.out.println(Arrays.toString(answer(arr, target)));

    }
    
}
