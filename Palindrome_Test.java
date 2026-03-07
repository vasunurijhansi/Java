import java.util.*;

public class Palindrome_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("Enter number:");
            int num = sc.nextInt();

            int temp = num;
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (temp == rev) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

        sc.close();
    }
}
