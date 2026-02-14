import java.util.*;
public class Comparing_numbers
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int number=sc.nextInt();
    if(number==0)
    {
        System.out.println("zero");
    }
    else if(number>0)
    {
        System.out.println("positive number");
    }
    else
    {
        System.out.println("negative number");
    }
    }
}