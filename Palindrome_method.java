import java.util.*;
public class Palindrome_method {
    static void palindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        palindrome(num); 
    }
}
