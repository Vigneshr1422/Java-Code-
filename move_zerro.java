import java.util.Scanner;

public class move_zerro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size ");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            for(int i : arr)
            {
                System.out.print(i+" ");
            }
        }

        for(int i=j+1;i<n;i++)
        {if(arr[i]!=0)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            j++;
        }
        }

        System.out.println("Answer is \n");

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
