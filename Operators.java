public class Operators
{
    public static void main(String args[])
    {
        int a=45;
        int b=56;
        int sum=a+b;
        System.out.println(sum);
        int num=3;
        if(num>0)
        {
            System.out.println("positive");
        }
        else if(num<0)
        {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        num=54;
        boolean status=true;
        if(num>0 && num%2==0)
        {
            System.out.println("positive and even");
        } 
        else if(num<0 || num%2==0)
        {
            System.out.println("positive and even");
        }
        else
        {
            status=false;
            System.out.println(!status);
        }
    }
}