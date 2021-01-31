// Java program to Reverse a string using the StringBuilder class
import java.lang.*;

// Class of ReverseString
class ReverseString
{
    public static void main(String[] args)
    {
        String originalString = "this string will be reversed";

        // create an instance of class StringBuilder called sb
        StringBuilder sb = new StringBuilder();

        // append a string into StringBuilder
        sb.append(originalString);

        // reverse the StringBuilder string and store in a new String variable
        String reversed = sb.reverse().toString();

        // print reversed String
        System.out.println(reversed);
    }
}
