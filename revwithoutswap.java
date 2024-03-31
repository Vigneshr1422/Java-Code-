package arrays;
import java.util.*;
public class revwithoutswap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size =in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("\nindex value of "+i+" th elemnent is : ");
            arr[i]=in.nextInt();
        }
        System.out.print("\nThe array elemnent is : ");
        for(int i=0;i<arr.length;i++)
        {
            
            System.out.print(arr[i]+" ");
        }
        int startIndex =0;
        int endIndex = size -1;
        while(startIndex<endIndex)
        {
            arr[startIndex]=arr[startIndex]+arr[endIndex];
            arr[endIndex]= arr[startIndex]-arr[endIndex];
            arr[startIndex]=arr[startIndex]-arr[endIndex];
            startIndex++;
            endIndex--;
        }
        System.out.print("\n\nThe  reverse element is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
           
        }
        in.close();

    }
    
}
