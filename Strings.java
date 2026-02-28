import java.util.*;
public class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("length:"+s1.length());
        System.out.println("character:"+s1.charAt(3));
        System.out.println("uppercase:"+s1.toUpperCase());
        System.out.println("lowercase:"+s1.toLowerCase());
        System.out.println("equals:"+s1.equals(s2));
        System.out.println("ignorecase:"+s1.equalsIgnoreCase(s2));
        System.out.println("compareto:"+s1.compareTo(s2));
        System.out.println("startswith:"+s1.startsWith("java"));
        System.out.println("endswith:"+s1.endsWith("java"));
        System.out.println("contains:"+s1.contains("Java"));
        System.out.println("indexof:"+s1.indexOf('j'));
        System.out.println("lastindexof:"+s1.lastIndexOf("java"));
        System.out.println("substring:"+s1.substring(4));
        System.out.println("substring:"+s1.substring(3,7));
    }
}