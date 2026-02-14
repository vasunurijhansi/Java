import java.util.*;
public class Largest_two_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println("enter b number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b)
        {
            System.out.println("a is big");
        }
        else{
            System.out.println("b is big");
        }
    }
}