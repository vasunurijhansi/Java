import java.util.*;
public class Palindrome_method_test{
    static void palindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is Palindrome");
        } else {
            System.out.println(temp + " is Not Palindrome");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many test cases:");
        int t = sc.nextInt();   // number of test cases
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter number " + i + ":");
            int num = sc.nextInt();
            palindrome(num);   // calling method
        }
    }
}