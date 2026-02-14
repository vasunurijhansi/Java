import java.util.*;
public class Vowels_or_consonents
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char character=sc.next().charAt(0);
        if(character=='a')
        {
            System.out.println("it is a vowel");
        }
        else if(character=='e')
        {
            System.out.println("it is a vowel");
        }
        else if(character=='i')
        {
            System.out.println("it is a vowel");
        }
        else if(character=='o')
        {
            System.out.println("it is a vowel");
        }
        else if(character=='u')
        {
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is a consonent");
        }
    } 
}