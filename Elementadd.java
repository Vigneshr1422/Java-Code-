package arrays;
import java.util.*;
public class Elementadd {
    public int[]  addarray(int[]arr,int position, int val )
    {
        int ans[]= new int[arr.length+1];
        for(int i =0;i<position;i++)
        {
            ans[i]=arr[i];
        }
        ans[position]=val;
        for(int j=position+1;j<ans.length;j++)
        {
            ans[j]=arr[j-1];
        }

        return ans;
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("The size of array : ");        
    int size  = in.nextInt();
    int arr[]= new int[size];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=in.nextInt();
    }
    System.out.println("Print the elements ");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    System.out.println("\nEnter the position ");
    int position=in.nextInt();
    System.out.println("Enter the value ");
    int val=in.nextInt(); 

    Elementadd ob1 = new Elementadd();
    int []finalarr=ob1.addarray(arr,position,val);

    System.out.println("updated array : ");
    for(int i=0;i<finalarr.length;i++)
    {
    System.out.println(finalarr[i]+" ");
    }
    System.out.println();
}

    
}
