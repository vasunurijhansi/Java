public class Palindrome {
    public static void main(String args[])
    {
        int num=121;
        int temp=num;
        int rev=1;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
