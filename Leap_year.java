import java.util.*;
public class Leap_year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();
        if(year/4==0)
        {
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}