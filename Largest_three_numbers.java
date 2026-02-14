import java.util.*;
public class Largest_three_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter b number");
        int b=sc.nextInt();
        System.out.println("enter c number");
        int c=sc.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}