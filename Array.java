import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }    
        System.out.println("array elments are:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
