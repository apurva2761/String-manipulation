import java.util.*;
public class java1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("enter two strings ");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);

        String msg= sb.toString();
        System.out.println(msg);
    }
}