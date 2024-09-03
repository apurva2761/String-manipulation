import java.util.*;
public class convert
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings");
        String s1=sc.nextLine();
         System.out.println("Enter substring");
        String s2=sc.nextLine();

        //check if substring is present or not 
        if(s1.contains(s2))
        {
            System.out.println("pass");
        }
        String str="hello world!";
        // replace string content
        String x=str.replace("world","java");
        System.out.println(x);

        // use of compareTo
        int result=s1.compareTo(s2);
        if(result > 0)
        {
            System.out.printf("%s is greater",s1);
        }
        else if(result < 0)
        {
            System.out.printf("%s is smaller",s1);
        } 
        else{
            System.out.println("string are equals");
        }
         
          // valueOf() and toString()
          int n= 27;
          System.out.println(String.valueOf(n));

          Double d=3.15;
          System.out.println(d.toString());
    }
}