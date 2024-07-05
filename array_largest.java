import java.util.*;
public class array_largest {
    public static int bruteforce(int arr[])
    {
        int max=arr[0];
        for(int value : arr)
        {
            if(value>max)
            {
                max=value;
            }
        }
        return max;
    }
    public static  int sorting(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int list(int arr[])
    {
        List<Integer> a = new ArrayList<>();
        for(int z : arr)
        {
            a.add(z);
        }
        return Collections.max(a);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size");
        int n=in.nextInt();
        System.out.println("Array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
         //System.out.println(bruteforce(arr));
        //System.out.println(two(arr));
        System.out.println(list(arr));



    }
}
