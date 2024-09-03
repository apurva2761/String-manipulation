import java.util.*;

public class Compare
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strings to compare");
        String s1=sc.nextLine();
        String s2= sc.nextLine();
        StringBuilder sb = new StringBuilder();
        if(s1.equals(s2))
        {
            System.out.println("strings are  equals");
        }
        else
        {
            System.out.println("Strings are not equals");
        }
    }
}