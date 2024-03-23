import java.util.*;
public class NumberCount {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = x.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10; 
            count++;
        }
       System.out.println("Number of digits: " + count);
        x.close(); 
    }
}

    

