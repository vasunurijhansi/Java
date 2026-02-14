import java.util.*;
public class Reverse_a_number
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int temp=number;
        int rev=0;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        System.out.println(rev);
    }
}