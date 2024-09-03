import java.util.*;
public class modification
{
    public static void main(String [] args)
    {
        StringBuilder sb = new StringBuilder("Hello World"); 
sb.append("!"); // insert ! at the end of the string

sb.insert(5, ","); // insert comma at 5 th index
sb.delete(5, 7); // will delete character from index 5 ,6 
String result = sb.toString(); // "Hello, World!" 
System.out.println(result);
    }
}