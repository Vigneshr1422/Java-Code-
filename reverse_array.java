import java.util.*;
public class reverse_array {
    static void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Array elemnts : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.print("\nThe Reverse array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


/* this program is used to reverse array in give instance 
 * 
   conditions are :     oru   array iruku ok athula first la irunthu last vara elemnt aa revese pannnau
   0   1   2   3   4   5
   1   5   9   3   4   8
   i=0                j=0  j = length -1 ;
   

 */