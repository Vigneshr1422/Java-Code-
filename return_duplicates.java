package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
Array Duplicates
Given an array arr of size n which contains elements in range from 0 to n-1,
you need to find all the elements occurring more than once in the given array.
Return the answer in ascending order. If no such element is found, return
list containing [-1].

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array.  output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3
Explanation: 2 and 3 occur more than once in the given array.
 */
public class return_duplicates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a size ");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter a element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
       ArrayList<Integer>answer= function_duplicate(arr);
        for(int x:answer)
        {
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> function_duplicate(int[] arr) {
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
        for(int x:arr)
        {
            if(!a.add(x))
            {
                b.add(x);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>(b);
        Collections.sort(ans);
        if(ans.isEmpty())
        {
            ans.add(-1);
        }
        return ans;

    }
}
