import java.util.*;
public class trim_split_upper_lower
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();

        // trim the whitespaces from leading and trailling end 
        System.out.println(str.trim());

        //spliting the string into array of string 
        String [] s= str.split(" ");
        for(String s1:s)
        {
            System.out.println(s1);
        }
         
         //changing case of the string 
         System.out.println(str.toUpperCase());
         System.out.println(str.toLowerCase());
    }
}