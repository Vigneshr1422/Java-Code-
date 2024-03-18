import java.util.Scanner;
public class Replacenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number is ");
        int num = s.nextInt();
        String str = Integer.toString(num);
        String str1 = "";
        int len = str.length();

        for(int i = 0; i < len; ++i) {
            if (str.charAt(i) == '0') {
                str1 = str1 + "1";
            } else {
                str1 = str1 + str.charAt(i);
            }
        }

        System.out.println("The number is " + str1);
        s.close();
    }
}


